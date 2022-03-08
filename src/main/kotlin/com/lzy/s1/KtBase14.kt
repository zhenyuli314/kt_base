package com.lzy.s1
//todo when表达式（有返回值）--java的switch
fun main() {
    val week = 22

    //语句和表达式的区别。表达式有返回值，而语句没有

    //返回类型Any类型 == java的Object
    var info = when (week) {
        -1-> TODO("没有这个选项")
        1 -> "今天是星期一"
        2 -> 12
        else ->{
            println("hhhhhh")
        }
    }

    println(info) //用kotlin.Unit代替java的void关键字（else分支）

    println("maxOf的测试结果${maxOf(10,20)}")
}
/**
 * ------------------------if表达式----------------------------------
 */

fun maxOf(a:Int,b:Int) = if (a>b) a else b