package com.lzy.s4

fun main() {
    val map = mapOf("a" to 1,"b" to  2)
    //第一种，不存在则返回空
    println(map["a"])
    println(map["xxx"])
    //第二种
    println(map.getOrDefault("xx",-1))
    //第三种
    println(map.getOrElse("xx"){"空值"})
    //第四种,报异常
    println(map.getValue("xx"))
}