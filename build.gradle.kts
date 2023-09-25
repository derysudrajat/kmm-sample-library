plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.library").version("8.1.1").apply(false)
    kotlin("multiplatform").version("1.8.21").apply(false)
}
group = "io.github.derysudrajat.kmmlib"
version = "0.0.1"

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
