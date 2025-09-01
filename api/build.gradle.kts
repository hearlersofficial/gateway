apply(plugin = "org.jetbrains.kotlin.plugin.spring")
apply(plugin = "org.springframework.boot")


dependencies {
    implementation(project(":proto"))
    implementation(project(":domain"))

    implementation(project(":usecase:auth-usecase"))
    implementation(project(":usecase:counsel-usecase"))
    implementation(project(":usecase:counselor-usecase"))
    implementation(project(":usecase:prompt-usecase"))
    implementation(project(":usecase:user-usecase"))

    implementation(project(":adapter:grpc"))

    // Spring Boot
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    // Webflux
    implementation("org.springframework:spring-webflux")
    implementation("io.projectreactor:reactor-core")
    implementation("io.projectreactor.netty:reactor-netty")

    // JWT
    implementation("io.jsonwebtoken:jjwt-api:0.11.5")
    runtimeOnly("io.jsonwebtoken:jjwt-impl:0.11.5")
    runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.11.5")

    // Swagger
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.8.11")

    // gRPC
    implementation("net.devh:grpc-server-spring-boot-starter:3.1.0.RELEASE")

    // Spring Security
    implementation("org.springframework.boot:spring-boot-starter-security")
}