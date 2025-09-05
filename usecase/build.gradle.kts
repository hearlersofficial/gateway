subprojects {
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")


    dependencies {
        implementation(project(":proto"))
        implementation("org.springframework:spring-context")
        implementation("org.slf4j:slf4j-api")
    }
}