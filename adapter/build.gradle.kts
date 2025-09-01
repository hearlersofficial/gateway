
subprojects {
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")


    dependencies {
        implementation(project(":proto"))
        implementation(project(":domain"))
        implementation(project(":usecase:core"))
    }
}