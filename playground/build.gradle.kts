// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
  repositories {
    mavenCentral()
  }

  dependencies {
    // this version should match the local maven version of the gradle plugin, because we are testing local version
    classpath("me.gradleadvanceversion.gradle:auto-version-gradle:3.5.1")
  }
}

plugins {
  alias(libs.plugins.android.application) apply false
  alias(libs.plugins.kotlin.compose) apply false
}