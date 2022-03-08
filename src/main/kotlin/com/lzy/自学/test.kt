package com.lzy.自学

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // ⾮局部直接返回到 foo() 的调⽤者
        println(it)
    }
    println("this point is unreachable")
}
//sampleEnd
fun main() {
    foo()
}