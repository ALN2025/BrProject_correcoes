pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}

rootProject.name = "BrProject"
include("core")
project(":core").projectDir = file("correcao/build/gradle-jar/src")
