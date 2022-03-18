package com.lzy.s6

/**
 * 原理就是：把你的匿名函数 最后一行的返回值 加入一个新的集合，新集合的泛型是R，并且返回新集合
 */
fun main() {
    val list = listOf<String>("a","b","c")

    list.map {
        888
    }.map {
        print("$it ")
    }

    println()

    list.map {
        "名字是：$it"
    }.map {
        "【$it】"
    }.map {
        print("$it ")
    }
}