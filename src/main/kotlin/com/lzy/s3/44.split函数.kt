package com.lzy.s3

fun main() {
    val jsonText = "1,2,3,4"
    //自动类型推断：list == List<String>
    var list = jsonText.split(",")
    println(list)

    //c++解构 kt也有解构
    val (a,b,c,d) = list
    println("a:$a,b:$b,c:$c,d:$d")
}