package com.lzy.s3

import kotlin.math.roundToInt

fun main() {
    /**
     * toInt()是向下取整
     */
    val num1 = 123.53252
    println(num1.toInt())
    println(num1.roundToInt())

    /**
     * roundToInt()是四舍五入
     */
    val num2 = 123.45678
    println(num2.toInt())
    println(num2.roundToInt())

    /**
     * 保留3位小数.(四舍五入型)
     */
    val s = "%.3f".format(num1)
    println(s)
}