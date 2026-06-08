package com.hlju.funlinkbluetooth.core.model

sealed interface NearbyError {
    val displayMessage: String

    data class Auth(val detail: String? = null) : NearbyError {
        override val displayMessage: String = "认证失败${detail?.let { "：$it" }.orEmpty()}"
    }

    data class Api(val prefix: String, val statusCode: Int) : NearbyError {
        override val displayMessage: String = "$prefix：statusCode=$statusCode"
    }

    data class Unknown(val prefix: String, val detail: String) : NearbyError {
        override val displayMessage: String = "$prefix：$detail"
    }

    companion object {
        fun fromException(prefix: String, exception: Exception): NearbyError {
            val detail = exception.localizedMessage ?: exception.message ?: "未知错误"
            return Unknown(prefix, detail)
        }
    }
}
