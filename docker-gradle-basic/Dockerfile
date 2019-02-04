FROM java:8
WORKDIR /
EXPOSE 8080
ADD target/docker-gradle-basic-0.0.1-SNAPSHOT.jar docker-gradle-basic-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "docker-gradle-basic-0.0.1-SNAPSHOT.jar" ]