package com.medisafe.uikmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform