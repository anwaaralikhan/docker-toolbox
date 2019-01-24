Add given maven plugin in pom.xml

<plugin>
    <groupId>com.spotify</groupId>
    <artifactId>docker-maven-plugin</artifactId>
        <configuration>
            <imageName>springdocker</imageName>
            <baseImage>java</baseImage>
            <entryPoint>["java", "-jar", "/${project.build.finalName}.jar"]</entryPoint>
            <resources>
                <resource>
                    <targetPath>/</targetPath>
                    <directory>${project.build.directory}</directory>
                    <include>${project.build.finalName}.jar</include>
                </resource>
            </resources>
        </configuration>
    </plugin>
Navigate to the project folder and type following command you will be able to create image and run that image:

$ mvn clean package dockerfile:build
$ docker images
$ docker run -p 8080:8080 -t <image name>