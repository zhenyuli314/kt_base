package com.lzy.s2

/**
 *  完全版本： 方法名:（参数类型）-> 返回类型 = { 方法体（需要声明参数名） }
 *  类型推断： 方法名 = { 方法体（需要声明参数名及类型）) }
 */
fun main() {
    val method1 = { v1: Double, v2: Float, v3: Int ->
        "$v1+$v2+$v3"
    }//method1函数  (Double,Float,Int)->String
    println(method1(12.12,10.0f,99))

    val method2 = {
        100
    }//method2函数 ()->Int
    println(method2())

    val method3 = {num:Int->
        num
    }//method3函数 (Int)->Int
    println(method3(100))
}