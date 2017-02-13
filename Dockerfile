FROM java:8
COPY target/java-api-guidelines.jar /srv/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/srv/java-api-guidelines.jar"]
