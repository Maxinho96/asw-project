#!/bin/bash

# itera la richiesta all'infinito 

while true; do
    curl -X POST localhost:8080/aservice
    echo ""
	curl localhost:8080/aservice
	echo "" ; 
done 
