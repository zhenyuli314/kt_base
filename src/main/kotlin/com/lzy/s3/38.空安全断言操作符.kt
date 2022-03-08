package com.lzy.s3

fun main() {
    /**
     * 不加? name一定不为null，则无需要使用断言
     */
    var name : String = "214"
    var i = name.length
    println(i)

    /**
     * 加? 如果感觉name一定不为null，则需要使用断言 !!.
     */
    var name2 : String? = "214"
    var j = name2!!.length //如果为null，会报空指针异常，和java一样
    println(j)
}