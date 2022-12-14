# Présentation du projet
## Architecture du projet

![image](https://user-images.githubusercontent.com/52087288/206290248-2d84f98e-afc5-442b-9aa2-fc4172e63682.png)

## Structure du projet

![image](https://user-images.githubusercontent.com/52087288/206290613-eadf0c95-149d-40fa-a13d-fffa759af718.png)


# Customer-service

+ Affichage des paramétres de la configuration

![1](https://user-images.githubusercontent.com/52087288/206036728-8ec0468a-be5c-42b5-9605-eb000071a044.PNG)

![2](https://user-images.githubusercontent.com/52087288/206036849-808cc11e-3e58-4690-9a28-b8879c9e5fd7.PNG)

+ La liste des clients

![3](https://user-images.githubusercontent.com/52087288/206036874-1c4e5de2-3a47-493c-9357-49d1e83701c0.PNG)

+ Afficher un client par ID

![4](https://user-images.githubusercontent.com/52087288/206036919-9013adf4-9a0c-49ea-9435-d74873f8a149.PNG)

# Inventory Service

+ La liste des produits

![5](https://user-images.githubusercontent.com/52087288/206036923-69153595-f310-4bdf-a67c-6640e4dfeedb.PNG)

+ Afficher un produit par ID

![6](https://user-images.githubusercontent.com/52087288/206036927-1e2bd72e-3b05-4dcd-9f65-9212f9f7a75a.PNG)

# Order Service

+ Liste des orders

![7](https://user-images.githubusercontent.com/52087288/206036931-a5c12add-f47a-494e-9387-dd188fa37e3b.PNG)

+ Afficher un order par ID

![8](https://user-images.githubusercontent.com/52087288/206036934-c5b37c29-acc0-41f0-86b5-441ad3eb9037.PNG)

+ ProductItems by ID

![9](https://user-images.githubusercontent.com/52087288/206036937-80020d52-7021-48a9-940c-0691fe66ea28.PNG)

+ Order Projection

![10](https://user-images.githubusercontent.com/52087288/206036906-ed47cfc0-b0dc-4d35-adce-24b3bcf4429a.PNG)

# Frontend Web avec Angular

+ Liste des produits 
![11](https://user-images.githubusercontent.com/52087288/206036909-eb9ab57d-b7e2-436a-bc24-9701b7182471.PNG)

+ Liste des clients
![12](https://user-images.githubusercontent.com/52087288/206036912-4e2af05f-d4ab-4fb6-8a9a-81d65d76bb36.PNG)

+ Liste des orders d'un Client
![13](https://user-images.githubusercontent.com/52087288/206036914-04c3d027-8798-4332-b260-ff1862e62d94.PNG)

+ Les détails d'un order
![14](https://user-images.githubusercontent.com/52087288/206036917-28ecc53f-b7e3-4011-a146-e24129bde5f9.PNG)

# Consul Config (Billing Service)
Aprés le lancement du Consul via la commande 
```java
    consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=192.168.224.1
```
+ Ajout des paramétres dans l'interface WEB du Consul

![_1](https://user-images.githubusercontent.com/52087288/206926523-0c7912f1-49cd-4099-abc4-ca755ed77613.PNG)

+ La valeur du paramétre "token.accessTokenTimeout" 

![_2](https://user-images.githubusercontent.com/52087288/206926777-c6a4ca0b-9ff5-4959-b530-d5cc93f1c9c8.PNG)

+ La valeur du paramétre "token.refreshTokenTimeout" 

![_3](https://user-images.githubusercontent.com/52087288/206926806-e06fb0db-7d28-4380-8518-1c3c62f1c795.PNG)

+ L'affichage du paramétres 

![_4](https://user-images.githubusercontent.com/52087288/206926826-57fad63e-db3c-4001-858e-adc4fdef6aae.PNG)


# Vault Config (Billing Service)
Aprés l'exécution du Vault via la commande 
```java
    vault server -dev
```
![_55](https://user-images.githubusercontent.com/52087288/206926901-75085f4c-84ec-48e4-a2a1-1b929b844a27.PNG)

+ L'autentification par la clé Root Token afffichée aprés l'exécution du Vault

![_5](https://user-images.githubusercontent.com/52087288/206927045-42eb6dbe-da4a-4f65-9a93-73c8354bc51a.PNG)

+ Page d'acceuil de l'interface web du Vault

![_6](https://user-images.githubusercontent.com/52087288/206927072-ad19fe89-3de5-4930-a304-73d89239277f.PNG)

+ L'ajout et l'affichage des paramétres dans la line de commande

![_7](https://user-images.githubusercontent.com/52087288/206927158-dfdc2d0e-93e3-4dc8-a024-6243d3fad47a.PNG)

+ L'affichage des paramétres par l'interface Web

![_8](https://user-images.githubusercontent.com/52087288/206927231-8b58fd60-4660-4784-ae32-6655ac2266f7.PNG)

+ L'affichage des paramétres du micro-service "billing-service"

![_9](https://user-images.githubusercontent.com/52087288/206927279-8ffe8116-c3c2-4a83-85bb-140b8ca6f1be.PNG)




