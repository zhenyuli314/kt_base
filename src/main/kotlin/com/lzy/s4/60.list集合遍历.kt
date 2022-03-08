package com.lzy.s4

fun main() {
    var list = listOf<String>("a", "b", "c")
    //第一种
    for (s in list) {
        print(s)
    }
    println()
    //第二种
    list.forEach {
        print(it)
    }
    println()

    //第三种
    list.forEachIndexed { index, s ->
        print("$index:$s ")
    }
}