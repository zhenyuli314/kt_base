package com.lzy.s4

/**
 * 使用 getOrElse 和 getOrNull，可避免跟java一样的异常：空指针、下表越界
 */
fun main() {
    var list = listOf("a", "b", "c", "d")
    println(list[0])
    println(list.getOrElse(4, { "空值" }))
    println(list.getOrNull(4) ?: "你这里是空值")
}