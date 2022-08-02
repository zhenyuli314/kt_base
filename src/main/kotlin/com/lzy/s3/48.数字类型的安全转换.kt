package com.lzy.s3

/**
 * 以后字符串有整形相关的转换，尽量用toIntOrNull函数
 */
fun main() {
    val num : Int = "123".toInt()
    println(num)


    // OrNull() 通常解决转换失败时的问题，如果失败，则返回null
    val num3 : Int? = "123.231".toIntOrNull()
    println(num3)

    //会转换失败报错，因为123.231是浮点型。 正确的转换为：字符串-->浮点型-->整形
    val num2 : Int? = "123.231".toInt()
    println(num2)


}