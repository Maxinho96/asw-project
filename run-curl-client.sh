#!/bin/bash

# itera la richiesta 100 volte 

for i in {1..100}; do
    curl -X POST localhost:8080/aservice
    echo ""
	curl localhost:8080/aservice
	echo "" ; 
done 
