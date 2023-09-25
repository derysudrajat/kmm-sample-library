package io.github.derysudrajat.kmmlib

import kotlinx.serialization.SerialName

open class BaseEmptyBodyResponse (
    @SerialName("message") open var message : String? = null,
    @SerialName("status") open var status : String? = null
)
