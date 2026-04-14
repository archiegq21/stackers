import io.github.frankois944.spmForKmp.swiftPackageConfig
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.serialization)
    alias(libs.plugins.spm4kmm)
    alias(libs.plugins.mockkery)
    id("com.quibbly.stackers.kmp")
}

kotlin {
    jvmToolchain(libs.versions.jvm.target.get().toInt())

    android {
        namespace = "com.feature.search"
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
            baseName = "search"
            isStatic = true
        }
        @Suppress("OPT_IN_USAGE")
        iosTarget.swiftPackageConfig("search") {
            minIos = libs.versions.ios.target.get()
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.designsystem)
            implementation(projects.core.user)
            implementation(projects.core.database)
            implementation(projects.library.paging)
            implementation(projects.library.placeholder)

            api(projects.feature.api.search)

            implementation(libs.paging.common)
            implementation(libs.kotlinx.datetime)

            implementation(project.dependencies.platform(libs.koin.bom))
            implementation(libs.koin.core)
            implementation(libs.koin.compose)
            implementation(libs.koin.compose.viewmodel)
            implementation(libs.koin.compose.navigation3)

            implementation(libs.navigation3.ui)
            implementation(libs.navigation3.adaptive)
            implementation(libs.lifecycle.viewmodel.navigation3)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
            implementation(libs.turbine)
            implementation(libs.kotlinx.coroutines.test)
            implementation(libs.compose.ui.test)
            implementation(libs.koin.test)
        }
    }
}

dependencies {
    "androidRuntimeClasspath"(libs.compose.preview.tooling)
//    "androidTestImplementation"("androidx.compose.ui:ui-test-junit4-android:1.10.5")
//    "debugImplementation"("androidx.compose.ui:ui-test-manifest:1.10.5")
}