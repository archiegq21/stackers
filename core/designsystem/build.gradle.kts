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
        namespace = "com.core.designsystem"
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
            baseName = "designsystem"
            isStatic = true
        }
        @Suppress("OPT_IN_USAGE")
        iosTarget.swiftPackageConfig("designsystem") {
            minIos = libs.versions.ios.target.get()
        }
    }
    
    sourceSets {
        androidMain.dependencies {
            implementation(libs.ktor.client.android)
        }
        commonMain.dependencies {
            api(libs.compose.runtime)
            api(libs.compose.foundation)
            api(libs.compose.material3)
            api(libs.compose.ui)
            api(libs.compose.components.resources)
            api(libs.compose.components.preview)
            api(libs.compose.lifecycle)
            api(libs.compose.viewmodel)
            api(libs.lifecycle.common)
            api(libs.lifecycle.runtime)
            api(libs.window.size)
            api(libs.adaptive)

            api(project.dependencies.platform(libs.coil.bom))
            api(libs.coil.compose)
            implementation(libs.coil.ktor)
        }
        commonTest.dependencies {
            implementation(libs.compose.ui.test)
            implementation(libs.kotlin.test)
        }
        iosMain.dependencies {
            implementation(libs.ktor.client.darwin)
        }
    }
}

dependencies {
    "androidRuntimeClasspath"(libs.compose.preview.tooling)
}

compose.resources {
    packageOfResClass = "com.core.designsystem"
    generateResClass = always
    publicResClass = true
}