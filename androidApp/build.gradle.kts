plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "com.aistudioapp.dayswithoutbadhabits.android"
        minSdk = 22
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        viewBinding = true
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0-alpha04"

    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("io.insert-koin:koin-android:3.1.4")
    implementation("io.insert-koin:koin-android-ext:3.0.1")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0")

    // Android lifecycle
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.10")

    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:1.1.5")


    implementation("io.insert-koin:koin-androidx-compose:3.1.4")
    implementation("androidx.compose.ui:ui:1.2.0-alpha04")
    implementation("androidx.compose.material3:material3:1.0.0-alpha06")
    implementation("androidx.compose.ui:ui-tooling:1.2.0-alpha04")
    implementation ("androidx.navigation:navigation-compose:2.5.0-alpha03")
    implementation ( "com.google.accompanist:accompanist-insets:0.22.0-rc")
    implementation ("com.google.accompanist:accompanist-insets-ui:0.22.0-rc")
    debugImplementation("androidx.compose.ui:ui-tooling:1.1.1")
    implementation ("androidx.compose.ui:ui-tooling:1.1.1")

}

