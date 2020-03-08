plugins {
    id("com.android.application") version "3.6.1"
    kotlin("android") version "1.3.70"
}

repositories {
    google()
    jcenter()
}

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.3")

    defaultConfig {
        applicationId = "kr.boxresin.simpleandroidproject"
        minSdkVersion(14)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.70")
}
