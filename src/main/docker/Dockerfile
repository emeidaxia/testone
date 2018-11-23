FROM openjdk:8-jdk-alpine
VOLUME /tmp/project
ADD dockerservice2-1.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
