package org.example.b

import org.example.shared.Shared
import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull

class BTest {
    @Test
    fun test(){
        println("B: ${B().foo()}")
        println("Usage of Shared class in B: ${Shared().foo()}")
        val sharedRes = Shared::class.java.getResource("/resource.txt")?.readText()
        assertNotNull(sharedRes)
        println("Loaded shared resource in B: '$sharedRes'")
    }
}