plugins {
    `java-library`
    id("build.buf") version "0.10.3"
}

tasks.named("compileJava").configure { dependsOn("bufGenerate") }
//sourceSets["main"].java { srcDir("${layout.buildDirectory}/bufbuild/$GENERATED_DIR/java") }
sourceSets["main"].java { srcDir("build/bufbuild/generated/java") }


buf {
    generate {
        includeImports = true
    }
    enforceFormat = false
}

repositories {
    mavenCentral()
}

dependencies {
    // Protobuf 자바 구현체
    implementation("com.google.protobuf:protobuf-java:3.25.3")
    implementation("com.google.protobuf:protobuf-java-util:3.25.3")

     implementation("io.grpc:grpc-protobuf:1.63.0")
     implementation("io.grpc:grpc-stub:1.63.0")
     compileOnly("javax.annotation:javax.annotation-api:1.3.2") // for @Generated
}
