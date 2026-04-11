plugins {
    `kotlin-dsl`
}

group = "com.quibbly.stackers"

repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
}

dependencies {
    compileOnly(libs.kmm.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("stackers-kotlin-conventions") {
            id = "com.quibbly.stackers.kmp"
            implementationClass = "com.quibbly.stackers.KotlinMultiplatformPlugin"
        }
    }
}
