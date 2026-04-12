plugins {
    id("com.android.library")
}

android {
    namespace = "com.hlju.funlinkbluetooth.core.model"
    compileSdk = 37

    defaultConfig {
        minSdk = 36
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
