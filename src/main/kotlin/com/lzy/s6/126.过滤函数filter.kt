package com.lzy.s6
//filter：lambda返回true的元素加入新集合，false的不加入
fun main() {
    var list = listOf("a", "b", "c")
    val newList = list.filter {
        it != "a"
    }
    println(newList)
}