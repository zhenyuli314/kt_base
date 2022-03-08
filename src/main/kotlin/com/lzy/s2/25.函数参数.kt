package com.lzy.s2

fun main() {
    //属性的声明
    val property :String = "asd"
    //函数的声明
    val methodACtion:(Int,Int)->String = { num1,num2->
        "$num1+$num2"
    }

    println(methodACtion(1,2))
}