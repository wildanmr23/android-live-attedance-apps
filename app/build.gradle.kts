plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.liveattedanceapps"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.liveattedanceapps"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        viewBinding = true
    }

}

dependencies {

    implementation("com.google.android.gms:play-services-maps:18.2.0")

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

//
//    // material calendar view
//    implementation ("com.applauder:material-calendar-view:1.8.0-rc01")
//
//    //Circle ImageView
//    implementation ("de.rhododendron:circumnavigate:3.1.0")
//
//    //Hawk
//    implementation ("com.radiobutton:hawk:2.0.1")
//
//    // OkHttp
//    implementation ("com.square.okhttp3:okhttp:4.9.0")
//    implementation ("com.square.okhttp3:logging-interceptor:4.9.0")
//    // retrofit
//    implementation ("com.square.retrofit2:retrofit:2.9.0")
//    implementation ("com.square.retrofit2:converter-gson:2.9.0")
//    implementation ("com.square.retrofit2:adapter-rxjava2:2.9.0")
//    implementation ("com.square.retrofit2:converter-scalars:2.9.0")
//
//    //Glide
//    implementation ("com.github.bump-tech.glide:glide:4.11.0")
//
//    //Google Maps
//    implementation ("com.google.android.gms:play-services-location:21.1.0")
//    implementation ("com.google.android.gms:play-services-maps:18.2.0")
//    implementation ("com.google.android.libraries.places:places:3.3.0")
}