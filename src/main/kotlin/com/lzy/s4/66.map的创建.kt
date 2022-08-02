package com.lzy.s4

fun main() {
    val map1: Map<Any, Any> = mapOf("a" to 1, "b" to 2, 3 to "c")
    val map2: Map<String, Int> = mapOf(Pair("a", 1), Pair("b", 2))
    println(map1)
}