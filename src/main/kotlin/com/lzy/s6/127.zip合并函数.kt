package com.lzy.s6

fun main() {
    val names = listOf("张三","李四","王五")
    val ages = listOf(23,24,25,26)

    var zip = names.zip(ages)
    println(zip)

    zip.forEach {
        println("姓名：${it.first}，年龄：${it.second}")
    }

    var map = zip.toMap()
    println(map)
}