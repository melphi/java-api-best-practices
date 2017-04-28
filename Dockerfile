FROM java:8
COPY target/java-api-guidelines.jar /srv/
ENV JAVA_OPTS="-Xmx1g -Xms1g"
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar /srv/java-api-guidelines.jar
CMD []

