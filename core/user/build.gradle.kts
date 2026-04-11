import io.github.frankois944.spmForKmp.swiftPackageConfig
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.serialization)
    alias(libs.plugins.spm4kmm)
    id("com.quibbly.stackers.kmp")
}

kotlin {
    android {
        namespace = "com.core.user"
        compileSdk = libs.versions.android.compileSdk.get().toInt()
        minSdk = libs.versions.android.minSdk.get().toInt()

        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_21)
        }

        androidResources {
            enable = true
        }
    }

    listOf(
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "user"
            isStatic = true
        }
        @Suppress("OPT_IN_USAGE")
        iosTarget.swiftPackageConfig("user") {
            minIos = libs.versions.ios.target.get()
        }
    }
    
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.network)
            implementation(projects.core.database)
            implementation(projects.core.designsystem)
            implementation(projects.library.placeholder)
            api(projects.library.paging)

            api(libs.paging.common)
            api(libs.kotlinx.datetime)
            implementation(libs.kotlinx.serialization.core)
            implementation(libs.kotlinx.serialization.json)

            implementation(project.dependencies.platform(libs.koin.bom))
            implementation(libs.koin.core)
        }
        commonTest.dependencies {
            implementation(libs.compose.ui.test)
            implementation(libs.kotlin.test)
        }
    }
}

dependencies {
    "androidRuntimeClasspath"(libs.compose.preview.tooling)
}

compose.resources {
    packageOfResClass = "com.core.user"
    generateResClass = always
    publicResClass = true
}