package io.github.derysudrajat.kmmlib

import io.ktor.utils.io.errors.IOException

class BaseApiExeption(status: String?, val apiMessage: String) : IOException(apiMessage) {
    companion object {
        private val BAD_REQUEST_CODE = 400
    }
    val code = status?.toIntOrNull() ?: BAD_REQUEST_CODE
}

