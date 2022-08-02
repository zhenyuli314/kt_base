package com.lzy.s3

fun main() {
    val str = "12345678"
    str.forEach() {c:Char->
        println(c)
    }

    println("===================================================================")

    str.forEachIndexed(){index: Int, c: Char ->
        println(str.getOrNull(index))
        println(c)
    }
}