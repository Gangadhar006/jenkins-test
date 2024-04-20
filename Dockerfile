FROM openjdk:17-jdk-slim
WORKDIR /app
COPY /target/Docker-App.jar /app/Docker-App.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","Docker-App.jar"]