plugins {
   `kotlin-dsl`
}

group = "com.multi.module.buildlogic"

dependencies {
   compileOnly(libs.android.gradlePlugin)
   compileOnly(libs.android.tools.common)
   compileOnly(libs.kotlin.gradlePlugin)
   compileOnly(libs.ksp.gradlePlugin)
   compileOnly(libs.room.gradlePlugin)
}

gradlePlugin {
   plugins {
      register("androidApplication") {
         id = "multi.module.android.application"
         implementationClass = "AndroidApplicationConventionPlugin"
      }
      register("androidApplicationCompose") {
         id = "multi.module.android.application.compose"
         implementationClass = "AndroidApplicationComposeConventionPlugin"
      }
   }
}