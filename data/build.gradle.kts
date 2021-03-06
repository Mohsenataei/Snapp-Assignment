
plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion (28)


    defaultConfig {
        minSdkVersion (16)
        targetSdkVersion (28)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

//    buildTypes {
//        release {
//            minifyEnabled false
//            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
//        }
//    }

}


dependencies {

//    implementation project(path: ':buildSrc')
    implementation (Dependencies.CommonLibs.kotlin)
    implementation(Dependencies.CommonLibs.coroutines)
    implementation(Dependencies.CommonLibs.arrowCore)
    implementation(Dependencies.CommonLibs.arrowSyntax)
    kapt (Dependencies.CommonLibs.arrowMeta)

    implementation(Dependencies.JetpackLibs.lifecycleExtensions)
    implementation(Dependencies.JetpackLibs.livedataKtx)

    implementation(Dependencies.CommonLibs.dagger)
    kapt (Dependencies.CommonLibs.daggerCompiler)

    implementation(Dependencies.JetpackLibs.room)
    implementation(Dependencies.JetpackLibs.roomKtx)
    kapt (Dependencies.JetpackLibs.roomCompiler)

    implementation(Dependencies.CommonLibs.gson)
    implementation(Dependencies.CommonLibs.retrofit)
    implementation(Dependencies.CommonLibs.retrofitGson)

    testImplementation(Dependencies.TestLibs.junit)
    testImplementation(Dependencies.TestLibs.mockitoKotlin)


}