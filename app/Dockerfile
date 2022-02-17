FROM openjdk

WORKDIR /usr/src/app

COPY target/app-0.0.1-SNAPSHOT.jar /usr/src/app/app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]