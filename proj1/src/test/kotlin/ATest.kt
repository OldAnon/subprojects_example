package org.example.a
import org.example.shared.Shared
import org.junit.jupiter.api.Test

class ATest{
    @Test
    fun test(){
        println("A: ${A().foo()}")
        println("Usage of Shared class in A: ${Shared().foo()}")
        val aRes = this::class.java.getResource("/a_resource.txt")?.readText()
        kotlin.test.assertNotNull(aRes)
        println("Loaded a resource in A: '$aRes'")
        val sharedRes = Shared::class.java.getResource("/resource.txt")?.readText()
        kotlin.test.assertNotNull(sharedRes)
        println("Loaded shared resource in A: '$sharedRes'")
    }
}