plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.krai29.moviedatabase"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.krai29.moviedatabase"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Lifecycle
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    implementation ("androidx.lifecycle:lifecycle-common:2.6.1")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")

    //compose
    implementation ("androidx.compose.ui:ui:1.5.0-alpha02")
    implementation ("androidx.compose.material:material:1.5.0-alpha02")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    debugImplementation ("androidx.compose.ui:ui-tooling:1.5.0-alpha02")
    implementation ("androidx.compose.ui:ui-tooling-preview:1.5.0-alpha02")
    implementation ("androidx.compose.runtime:runtime-livedata:1.5.0-alpha02")


    //compose navigation
    implementation ("androidx.navigation:navigation-compose:2.5.3")
    implementation ("androidx.hilt:hilt-navigation-compose:1.0.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")


    // Dagger hilt
    implementation ("com.google.dagger:hilt-android:2.45")
    implementation ("com.google.dagger:hilt-compiler:2.45")


    // Networking
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-moshi:2.9.0")
    implementation ("com.squareup.okhttp3:okhttp:5.0.0-alpha.2")
    implementation ("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2")


    // Moshi
    implementation ("com.squareup.moshi:moshi-kotlin:1.14.0")
    implementation ("com.squareup.moshi:moshi-kotlin-codegen:1.14.0")


    // Coroutine
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")


    // Room and room pagination
    implementation("androidx.room:room-paging:2.6.1")
    implementation ("androidx.room:room-runtime:2.6.1")


    // coil image loading
    implementation ("io.coil-kt:coil-compose:2.3.0")

    // multidex
    implementation ("androidx.multidex:multidex:2.0.1")


    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4:1.5.0-alpha02")
    debugImplementation ("androidx.compose.ui:ui-tooling:1.5.0-alpha02")
    debugImplementation ("androidx.compose.ui:ui-test-manifest:1.5.0-alpha02")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.10")
    //if update warning comes then go to settings and install latest plugin and restart
}