apply(plugin = "org.jetbrains.kotlin.plugin.spring")
apply(plugin = "org.springframework.boot")


dependencies {
    implementation(project(":proto"))
    implementation(project(":common"))
    implementation(project(":domain"))

    implementation(project(":usecase:auth-usecase"))
    implementation(project(":usecase:counsel-usecase"))
    implementation(project(":usecase:counselor-usecase"))
    implementation(project(":usecase:prompt-usecase"))
    implementation(project(":usecase:user-usecase"))

    implementation(project(":adapter:grpc"))
    implementation(project(":adapter:jwt"))
    implementation(project(":adapter:oauth"))


    // Spring Boot
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    // Swagger
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.8.11")

    // gRPC
    implementation("net.devh:grpc-server-spring-boot-starter:3.1.0.RELEASE")

    // Spring Security
    implementation("org.springframework.boot:spring-boot-starter-security")

    // resilience
    implementation("io.github.resilience4j:resilience4j-ratelimiter:2.3.0")
    implementation("io.github.resilience4j:resilience4j-spring-boot3:2.3.0")

}
