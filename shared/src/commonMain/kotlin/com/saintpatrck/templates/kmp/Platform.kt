package com.saintpatrck.templates.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform