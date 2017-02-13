# Java REST API best practices

A working example with Spring Boot.

## How to run
You can run the application from Maven, from Docker or as Java standalone executable. After few seconds the application should be availabe, for example http://localhost:8080/health returns the health status.

### Maven
Form the repository base folder run:
```
mvn spring-boot:run
```

## Docker
```
sh build-docker.sh
docker run --net=host java-api-guidelines
```

## Java standalone executable
```
mvn package
java -jar target/java-api-guidelines.jar
```
