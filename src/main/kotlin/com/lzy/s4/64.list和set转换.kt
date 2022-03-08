package com.lzy.s4

/**
 * distinct == .toMutableSet().toList()
 */
fun main() {
    var list = listOf("a", "a", "b", "b", "c")
    println(list.toSet())
    println(list.distinct())
}