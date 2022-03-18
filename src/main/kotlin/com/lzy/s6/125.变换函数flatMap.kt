package com.lzy.s6

/**
 * 观察map和flatMap结果的区别
 */
fun main() {
    val list = listOf("张三","李四","王五")
    val newList1 = list.map {
        listOf("$it 学习Java","$it 学习kt","$it 学习c++")
    }

    //flatMap（平面映射）的结果被扁平化了
    val newList2 = list.flatMap {
        listOf("$it 学习Java","$it 学习kt","$it 学习c++")
    }

    println(newList1)
    println(newList2)
}