FROM maven:3.6.3-openjdk-17.0.8 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.8-jdk-slim
COPY --from=build /target/cockatiel-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]