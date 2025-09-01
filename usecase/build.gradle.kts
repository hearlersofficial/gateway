subprojects {
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")


    dependencies {
        implementation(project(":proto"))
g        implementation(project(":domain"))
        implementation("org.springframework:spring-context")
        implementation("org.slf4j:slf4j-api")
    }
}