package com.medisafe.CoreKMM

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform