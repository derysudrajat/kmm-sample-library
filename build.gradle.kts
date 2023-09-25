import java.net.URI

buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.google.com")
        maven("https://jitpack.io")
    }

    dependencies {
        classpath(kotlin("gradle-plugin", "1.6.21"))
        classpath("com.android.tools.build:gradle:7.4.2")
    }
}

allprojects {

    repositories {
        google()
        mavenCentral()
        maven { url = URI.create("https://maven.google.com") }
        maven { url = URI.create("https://jitpack.io") }
    }
}



group = "io.github.derysudrajat.kmmlib"
version = "0.0.2"

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
