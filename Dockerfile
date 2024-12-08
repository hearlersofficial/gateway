# Gradle 빌드 단계
FROM gradle:8.11.1-jdk21 AS build
WORKDIR /app
COPY . .
RUN ./gradlew build --no-daemon

# 실행 단계
FROM openjdk:21-slim
ARG JAR_FILE=build/libs/*.jar
WORKDIR /app
COPY --from=build /app/${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
