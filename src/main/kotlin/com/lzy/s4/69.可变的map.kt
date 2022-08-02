package com.lzy.s4

/**
 * 1.可变集合的操作+= [] put
 * 2.getOrPut 没有的情况
 * 3.getOrPut 有的情况
 */
fun main() {
    val map = mutableMapOf("a" to 1, "b" to 2)
    map += "c" to 3

    //2.getOrPut 没有的情况,先添加到map中，再取出来
    println(map.getOrPut("xxx") { 555 })
    //3.getOrPut 有的情况，666备用值就失效了
    println(map.getOrPut("xxx") { 666 })

}