package com.lzy.s4

fun main() {
    val set = mutableSetOf<String>("a","b")
    set+="1"
    set+="2"
    set.add("c")
    println(set)
}