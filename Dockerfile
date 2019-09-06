FROM openjdk:8
MAINTAINER arkarmoe@example.com
VOLUME /tmp
ADD target/spring-docker-compose.jar spring-docker-compose.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","spring-docker-compose.jar"]
