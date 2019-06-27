# asw-project
Project for the software architectures class, Roma Tre University.

## How to run the project

* Execution environment: the workstation execution environment can be executed from [environments/workstation](environments/workstation) using Vagrant, running:
```
    vagrant up
    vagrant ssh workstation
```
* Building: you can build the project executing:
```
    ./build-java-projects.sh
    ./build-docker-images-with-compose.sh
```
* Cleaning: you can clean the project executing:
```
    ./clean-java-projects.sh
```
* Running: you can run the server executing:
```   
    ./start-services.sh # without services replication
    ./start-services-replicated.sh # with services replication
```
   this could require running this first:
```
    ./set-docker-host-ip.sh
```

* Stopping: you can stop the server executing:
```
    ./stop-services.sh
```
* Client: you can run a simple curl client executing:
```   
    ./run-curl-client.sh <requests_number> <sleep_time>
```
   if requests_number is 0, the client will do infinite requests
   sleep_time is the sleep time between two requests (in seconds)
