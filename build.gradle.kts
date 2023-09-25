plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.library").version("7.4.2").apply(false)
    kotlin("multiplatform").version("1.6.21").apply(false)
}
group = "io.github.derysudrajat.kmmlib"
version = "0.0.2"

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
