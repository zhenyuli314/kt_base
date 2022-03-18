@file:JvmName("KtBase133kt")
package com.lzy.s7

fun show1(name:String,age:Int = 12){
    println("$name,$age")
}

@JvmOverloads //原理：编译环节，专门重载了一个方法，专门给Java使用
fun show2(name:String,age:Int = 12){
    println("$name,$age")
}