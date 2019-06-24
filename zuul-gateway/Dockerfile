# Dockerfile for Zuul

FROM openjdk:8-jdk 

ADD build/libs/zuul.jar zuul.jar

EXPOSE 8080

ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "zuul.jar"]
