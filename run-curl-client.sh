#!/bin/bash

if [ $# != 2 ]
then
    printf "Usage: %s <requests_number> <sleep_time>\n\n" $0
    printf "\t if requests_number is 0, the client will do infinite requests\n"
    printf "\t sleep_time is the sleep time between two requests (in seconds)\n"
    exit 1
fi

function make_one_request {
    curl -X POST localhost:8080/aservice
    echo ""
	curl localhost:8080/aservice
	echo ""
}

REQUESTS_N=$1
SLEEP_TIME=$2

if [ $REQUESTS_N == 0 ]
then
    while sleep $SLEEP_TIME; do
        make_one_request
    done
else
    for i in `seq 1 $REQUESTS_N`; do
        make_one_request
        sleep $SLEEP_TIME
    done
fi
