FROM maven:3.8.6 AS builder
WORKDIR /build
COPY . .
RUN mvn clean install -DskipTests

FROM openjdk:17
WORKDIR /opt/app
COPY --from=builder /build/target/mock-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]