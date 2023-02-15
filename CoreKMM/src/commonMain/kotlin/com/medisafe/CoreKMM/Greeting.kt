package com.medisafe.CoreKMM

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}

class MyClass {

    fun test() {
        print("test")
    }
}