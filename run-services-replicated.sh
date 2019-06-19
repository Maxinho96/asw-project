#!/bin/bash

# Script per avviare l'applicazione con più istanze

echo Running Application

echo Starting Eureka Server
java -Xms64m -Xmx128m -jar eureka-server/build/libs/eureka.jar &

echo Starting A Service *2
java -Xms64m -Xmx128m -jar a-service/build/libs/aservice.jar &
java -Xms64m -Xmx128m -jar a-service/build/libs/aservice.jar &

echo Starting C Service *2
java -Xms64m -Xmx128m -jar c-service/build/libs/cservice.jar &
java -Xms64m -Xmx128m -jar c-service/build/libs/cservice.jar &

echo Starting Zuul Gateway

java -Xms64m -Xmx128m -jar zuul-gateway/build/libs/zuul.jar &
