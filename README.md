# javaschoolrest [belrbeZ]
Goal: Show SWAGGER Code Generation simple example with Spring Boot
## Instructions
1. Describe your API using Swagger Editor - 
2. Create simple Spring Boot Project - https://start.spring.io/
3. Add maven dependencies - see `./pom.xml` file or use SpringFOX https://springfox.github.io/springfox/docs/current/
4. Describe Swagger Codegen Plugin Execution https://github.com/swagger-api/swagger-codegen
5. Compile project to generate sources - see `How to Build` block
6. Star this Repository ;) 
Spring Boot How to - https://spring.io/guides/gs/spring-boot/
Swagger Example - https://www.baeldung.com/spring-boot-rest-client-swagger-codegen
## How to Build
Install Maven\
https://maven.apache.org/install.html\
Clone project\
Use next command line command to quickly generate swagger sources in `./target` folder \
`mvn clean compile -P !generate-api-only`\
Or use generation of API only\
`mvn clean package`
