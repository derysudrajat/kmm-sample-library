package io.github.derysudrajat.kmmlib

import kotlinx.serialization.SerialName

open class BaseResponse<T>(
    @SerialName("data") open var data: T? = null
) : BaseEmptyBodyResponse()
