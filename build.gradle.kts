import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("java")
    id("org.springframework.boot") version "3.5.5" apply false
    kotlin("jvm") version "2.2.10" apply false
    kotlin("plugin.spring") version "2.2.10" apply false
}

group = "com.hearlers.gateway"
version = "0.0.1-SNAPSHOT"


subprojects {
    apply(plugin = "java")
    apply(plugin = "idea")
    apply(plugin = "org.jetbrains.kotlin.jvm")


    configure<JavaPluginExtension> {
        sourceCompatibility = JavaVersion.VERSION_21
        toolchain {
            languageVersion = JavaLanguageVersion.of(21)
        }
    }


    configurations {
        compileOnly {
            extendsFrom(configurations.annotationProcessor.get())
        }
    }



    repositories {
        mavenCentral()
    }


    dependencies {
        implementation(platform(project.dependencies.create("org.springframework.boot:spring-boot-dependencies:3.5.5")))
        annotationProcessor(platform(project.dependencies.create("org.springframework.boot:spring-boot-dependencies:3.5.5")))
        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
        implementation("org.slf4j:slf4j-api")

        // Lombok
        compileOnly("org.projectlombok:lombok:1.18.30")
        annotationProcessor("org.projectlombok:lombok:1.18.30")

        // MapStruct & Lombok
        implementation("org.mapstruct:mapstruct:1.5.5.Final")
        annotationProcessor("org.mapstruct:mapstruct-processor:1.5.5.Final")
        annotationProcessor("org.projectlombok:lombok-mapstruct-binding:0.2.0")

        // Kotlin
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
        implementation("io.github.oshai:kotlin-logging-jvm:7.0.13")
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        compilerOptions {
            freeCompilerArgs.add("-Xjsr305=strict")
            jvmTarget.set(JvmTarget.JVM_21)
        }
    }

    tasks.named<Test>("test") {
        useJUnitPlatform()
    }
}
