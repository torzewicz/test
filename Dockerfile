FROM adoptopenjdk/openjdk8:latest
WORKDIR /
ADD target/test-1.0-SNAPSHOT.jar test.jar
EXPOSE 8080
CMD ["java", "-jar", "test.jar"]
