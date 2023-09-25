package io.github.derysudrajat.kmmlib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform