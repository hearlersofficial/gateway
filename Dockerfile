# Gradle 빌드 단계
FROM gradle:8.11.1-jdk21 AS build
WORKDIR /app

# Gradle 설정 파일들 먼저 복사 (캐싱을 위해)
COPY build.gradle.kts settings.gradle ./
COPY gradle/ gradle/

# 의존성 다운로드 (캐싱 활용)
RUN ./gradlew dependencies --no-daemon

# 프로젝트 소스 복사
COPY . .

# 빌드 실행
RUN ./gradlew build --no-daemon --parallel --build-cache -x test

# 실행 단계
FROM openjdk:21-slim
ARG JAR_FILE=api/build/libs/*.jar
WORKDIR /app
COPY --from=build /app/${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
