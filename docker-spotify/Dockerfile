FROM java:8
WORKDIR /
EXPOSE 8080
ADD target/docker-spotify-0.0.1-SNAPSHOT.jar docker-spotify-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "docker-spotify-0.0.1-SNAPSHOT.jar" ]