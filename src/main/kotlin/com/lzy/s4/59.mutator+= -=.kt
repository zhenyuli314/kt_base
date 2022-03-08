package com.lzy.s4

/**
 * mutator: += -=
 * removeIf
 */
fun main() {
    val list = mutableListOf(1, 2, 3)
    list+=100
    list+=200
    println(list)

    list.removeIf{it==100}
    println(list)
}