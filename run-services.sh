#!/bin/bash

# Script per avviare l'applicazione 

echo Running application

echo Starting Eureka Server  
java -Xms64m -Xmx128m -jar eureka-server/build/libs/eureka-server.jar &

echo Starting A Service
java -Xms64m -Xmx128m -jar a-service/build/libs/a-service.jar &

# echo Starting Sentence B Service

# java -Xms64m -Xmx128m -jar sentence-service/build/libs/b-service.jar &

echo Starting Zuul Gateway

java -Xms64m -Xmx128m -jar zuul-gateway/build/libs/zuul-gateway.jar &
