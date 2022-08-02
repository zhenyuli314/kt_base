package com.lzy.s4

fun main() {
    var set = setOf<String>("a", "a", "b", "b", "c")
    println(set)
    println(set.elementAt(0))

//    println(set.elementAt(3))//越界会报异常

    /**
     * 安全的调用方法：elementAtOrElse\elementAtOrNull
     */
    println(set.elementAtOrElse(3, { "你越界了,index为$it" }))
    println(set.elementAtOrNull(3))
}