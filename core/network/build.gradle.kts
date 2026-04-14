import com.quibbly.stackers.Environment
import io.github.frankois944.spmForKmp.swiftPackageConfig
import com.codingfeline.buildkonfig.compiler.FieldSpec.Type
import com.quibbly.stackers.Keys
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.konan.properties.Properties
import kotlin.apply


plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.serialization)
    alias(libs.plugins.spm4kmm)
    alias(libs.plugins.buildconfig)
    id("com.quibbly.stackers.kmp")
}

val keyStoreProperties =
    readProperties(file(projectDir.resolve("../../keys/keystore.properties")))

kotlin {
    android {
        namespace = "com.core.network"
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
            baseName = "network"
            isStatic = true
        }
        @Suppress("OPT_IN_USAGE")
        iosTarget.swiftPackageConfig("network") {
            minIos = libs.versions.ios.target.get()
        }
    }
    
    sourceSets {
        androidMain.dependencies {
            implementation(libs.ktor.client.android)
        }
        commonMain.dependencies {
            implementation(libs.kotlinx.datetime)
            implementation(libs.kotlinx.coroutines.core)
            api(libs.ktor.client.core)
            implementation(libs.ktor.client.auth)
            implementation(libs.ktor.client.content.negotiation)
            implementation(libs.ktor.serialization.kotlinx.json)
            implementation(libs.ktor.client.logging)

            implementation(project.dependencies.platform(libs.koin.bom))
            implementation(libs.koin.core)

            implementation(libs.kermit)
            implementation(libs.kermit.koin)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
        iosMain.dependencies {
            implementation(libs.ktor.client.darwin)
        }
    }
}

buildkonfig {
    packageName = "com.core.network"
    exposeObjectWithName = "NetworkConfig"

    defaultConfigs {}
    defaultConfigs(Environment.DEBUG.value) {
        buildConfigField(Type.BOOLEAN, Keys.IS_DEBUG, true.toString())
        buildConfigField(Type.STRING, Keys.API_KEY, keyStoreProperties.getProperty(Keys.STACK_EXCHANGE_API_KEY))
    }
    defaultConfigs(Environment.RELEASE.value) {
        buildConfigField(Type.BOOLEAN, Keys.IS_DEBUG, false.toString())
        buildConfigField(Type.STRING, Keys.API_KEY, keyStoreProperties.getProperty(Keys.STACK_EXCHANGE_API_KEY))
    }
}

private fun readProperties(propertiesFile: File) = Properties().apply {
    propertiesFile.inputStream().use { fis ->
        load(fis)
    }
}