# Dockerfile for a service

FROM openjdk:8-jdk

RUN apt-get update && apt-get install -y curl

ADD build/libs/bservice.jar bservice.jar

ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "bservice.jar"]

HEALTHCHECK --start-period=30s --interval=10s CMD curl -f http://localhost:8080/actuator/health || exit 1