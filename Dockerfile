FROM adoptopenjdk/openjdk8:latest
WORKDIR /
ADD test.jar test.jar
EXPOSE 8080
CMD ["java", "-jar", "test.jar"]
