package io.github.derysudrajat.kmmlib

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

object BaseRemoteImpl {
    val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

    fun <Data> validateResponse(baseResponse: BaseResponse<Data>): Data {
        validateResponse(baseResponse as BaseEmptyBodyResponse)
        return baseResponse.data ?: throw BaseApiExeption(
            baseResponse.status,
            baseResponse.message.orEmpty()
        )
    }

    fun validateResponse(baseResponse: BaseEmptyBodyResponse) {
        if (baseResponse.status != "00") throw BaseApiExeption(
            baseResponse.status,
            baseResponse.message.orEmpty()
        )
    }




}