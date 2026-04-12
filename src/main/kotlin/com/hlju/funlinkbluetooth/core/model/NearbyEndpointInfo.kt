package com.hlju.funlinkbluetooth.core.model

data class NearbyEndpointInfo(
    val endpointId: String,
    val endpointName: String,
    val bandwidthQuality: Int = 0
)
