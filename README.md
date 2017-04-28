# Java REST API best practices

A working example with Spring Boot.

## How to run
You can run the application from Maven, from Docker or as Java standalone executable. To build the application you will need Maven and Java8. After few seconds the application should be availabe, for example http://localhost:8080/health returns the health status.

### Maven
Form the repository base folder run:
```
mvn spring-boot:run
```

## Docker
Docker should be installed in your computer.
```
sh build-docker.sh
sudo docker run --net=host -e JAVA_OPTS="-Xmx1g -Xms1g" java-api-guidelines
```

## Java standalone executable
```
mvn package
java -jar target/java-api-guidelines.jar
```
