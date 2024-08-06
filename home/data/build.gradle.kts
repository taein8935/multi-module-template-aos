plugins {
    alias(libs.plugins.multi.module.android.library)
}

android {
    namespace = "com.multi.module.home.data"
}

dependencies {

    implementation(projects.home.domain)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}