package com.lzy.自学

fun main() {
    val p = printCalc()
    println(p())
}

//返回类型为 () -> Int 的函数
inline fun printCalc(): () -> Int {
    var a = 3
    val b = 4
    //返回一个匿名函数
    return {
        //修改作用域外的变量
        a++
        a + b
    }
}