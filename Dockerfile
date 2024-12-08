# Gradle 빌드 단계
FROM gradle:8.11.1-jdk21 AS build
WORKDIR /app

# 빌드 인자 정의
ARG JWT_SECRET
ARG KAKAO_CLIENT_ID

# 빌드 인자를 환경 변수로 설정
ENV JWT_SECRET=${JWT_SECRET}
ENV KAKAO_CLIENT_ID=${KAKAO_CLIENT_ID}

# 프로젝트 소스 복사
COPY . .

# Gradle 빌드 시 환경 변수 사용
RUN ./gradlew build --no-daemon

# 실행 단계
FROM openjdk:21-slim
ARG JAR_FILE=build/libs/*.jar
WORKDIR /app
COPY --from=build /app/${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
