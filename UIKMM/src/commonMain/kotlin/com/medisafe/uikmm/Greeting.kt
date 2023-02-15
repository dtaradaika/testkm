package com.medisafe.uikmm
import com.medisafe.CoreKMM
import com.medisafe.CoreKMM.MyClass

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {

        val my = MyClass()

        my.test()

        return "Hello, ${platform.name}!"
    }
}