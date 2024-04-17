package org.example.shared

class Shared {
    fun foo(): String{
        val res = this::class.java.getResource("/resource.txt").readText()
        return "I am Shared, my resource: '$res'"
    }
}