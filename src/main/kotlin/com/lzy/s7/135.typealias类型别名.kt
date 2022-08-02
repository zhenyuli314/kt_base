package com.lzy.s7

typealias MyHandler = (Int)->String

fun main() {
    val obj : MyHandler = {
        "结果是：$it"
    }
    val res = obj(1)
    println(res)
}