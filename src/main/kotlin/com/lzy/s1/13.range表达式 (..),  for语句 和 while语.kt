package com.lzy.s1
//todo: range表达式 (..),  for语句 和 while语句
fun main() {
    // .. 就是range
    for (i in 1..10){
        print(i)
    }
    println()
    for (i in 10 downTo 1 step 2 ){
        print(i)
    }
    println()
    for (i in 1 until 10){
        println(i)
    }

    var num = 1
    while (num<10){
        print("$num  ")
        num++
    }

}