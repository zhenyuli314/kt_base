package com.lzy.s4

/**
 * 可变list和不可变list的区别：
 *  add  remove 等
 */
fun main() {
    val list = mutableListOf("a", "b", "c")
    list.add("d")
    list.remove("c")
    list.removeAt(0)
    println(list)
    //不可变集合-->可变集合
    var list1 = listOf(1, 2, 3)
    list1.toMutableList()

    //可变集合-->不可变集合
    var list2 = mutableListOf(4, 5, 6)
    list2.toList()
}