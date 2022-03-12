# Abordagem Java-Spring com reverse-proxy publicada em containers

## Inicialização:
> docker compose up



---
Listening 8080 
http://localhost:8080/hello


E 80 via proxy reverso
http://localhost/hello



## Utilização do DevTools - 11.03.2022

POM: Devtools
POM: Exclude = false 
Application.properties => spring.devtools.remote.secret
Open 'launch.json':

{
    "configurations": [
        {
            "type": "java",
            "name": "Remote DevTools",
            "request": "launch",
            "cwd": "${workspaceFolder}",
            "console": "internalConsole",
            "mainClass": "org.springframework.boot.devtools.RemoteSpringApplication",
            "projectName": "app",
            "args": "http://localhost:8080"
        },
        
    ]
}

# Running
docker compose up
start debug -> yes, both processes running in consonance


# Deployment Strategies
1. Continuous Integration - Docker along with Jenkins
1. Spring Boot Jar file with everything embedded inside
1. Code on the Server -> using maven
1. WAR file uploaded into a Tomcat Container
1. Docker Image

