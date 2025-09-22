
subprojects {
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")


    dependencies {
        implementation(project(":proto"))
        implementation(project(":common"))
        implementation(project(":domain"))
        implementation(project(":usecase:core"))
        implementation("org.springframework:spring-context")
    }
}