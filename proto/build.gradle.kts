plugins {
    `java-library`
    id("build.buf") version "0.10.3"
}

tasks.named("compileJava").configure { dependsOn("bufGenerate") }
tasks.named("compileKotlin").configure { dependsOn("bufGenerate") }

//sourceSets["main"].java { srcDir("${layout.buildDirectory}/bufbuild/$GENERATED_DIR/java") }
sourceSets["main"].java { srcDir("build/bufbuild/generated/java") }
sourceSets["main"].kotlin { srcDir("build/bufbuild/generated/kotlin") }



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
    api("com.google.protobuf:protobuf-java:3.25.3")
    implementation("com.google.protobuf:protobuf-java-util:3.25.3")

    implementation("io.grpc:grpc-protobuf:1.62.2")
    implementation("io.grpc:grpc-stub:1.62.2")
    implementation("io.grpc:grpc-kotlin-stub:1.4.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    compileOnly("javax.annotation:javax.annotation-api:1.3.2") // for @Generated
    implementation("com.google.protobuf:protobuf-kotlin:4.32.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.22")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.22")

}
