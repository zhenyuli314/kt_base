package com.lzy.s2

/**
 * 匿名函数只有一个形参时，可以使用it代替
 */
fun main() {
    val methodAction:(Int)->String={
        val age = it+1
        "age:$age"
    }
    println(methodAction(100))
}