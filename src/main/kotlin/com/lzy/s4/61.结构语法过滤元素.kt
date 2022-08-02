package com.lzy.s4

/**
 * 集合配合解构语法，反编译看java语句
 * 用_可以不接受赋值，_不是变量名，是用来过滤解构赋值的
 */
fun main() {
    val list = listOf("a", "b", "c")
    val (n1, n2, n3) = list
    print("n1:$n1, n2:$n2, n3:$n3")

    println()
    var (_, n4, n5) = list
    print("n4:$n4, n5:$n5")

}