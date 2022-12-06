package com.example.securityservice.config;

import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.RSAKey;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.config.web.servlet.OAuth2ResourceServerDsl;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.servlet.FilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig  {
    private RsakeysConfig rsakeysConfig;
    private PasswordEncoder passwordEncoder;

   /* public SecurityConfig(RsakeysConfig rsakeysConfig, PasswordEncoder passwordEncoder) {
        this.rsakeysConfig = rsakeysConfig;
        this.passwordEncoder = passwordEncoder;
    }*/

    @Bean
    public AuthenticationManager authenticationManager(UserDetailsService userDetailsService){

        return null;
    }

    //Les users de notre system avec l'autentification basic
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        return new InMemoryUserDetailsManager(
                User.withUsername("user1").password("{noop}1234").authorities("USER").build(),
                User.withUsername("user2").password("{noop}1234").authorities("USER").build(),
                User.withUsername("user3").password("{noop}1234").authorities("USER").build(),
                User.withUsername("admin").password("{noop}1234").authorities("USER","ADMIN").build()
        );
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.csrf(csrf->csrf.disable())
                .authorizeRequests(auth->auth.anyRequest().authenticated())
                .sessionManagement(sess->sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
                .httpBasic(Customizer.withDefaults())
                .build();
    }

    public JwtEncoder jwtEncoder(){
        //JWK jwk=new RSAKey.Builder(rsakeysConfig.publicKey()).privateKey(rsakeysConfig.).build();
        return null;
    }
    public JwtDecoder jwtDecoder(){

        return NimbusJwtDecoder.withPublicKey(rsakeysConfig.publicKey()).build();
    }
}
