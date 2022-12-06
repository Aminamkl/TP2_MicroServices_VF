package com.example.securityservice.web;

import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestRestAPI {
    @GetMapping("/dataTest")
    public Map<String ,Object> dataTest(){
        return Map.of("data","test");
    }

    @GetMapping("/saveData")
    public Map<String,String> saveData(Authentication authentication){
        return null;
    }
}

