package com.lzy.s1
//todo: 编译时常量。只能是常用的基本数据类型：（String,Double,Int,Float,Long,Short,Byte,Char,Boolean）
//为什么 编译时常量 只能用在函数之外定义？如果在函数之内定义，就必须在运行时才能调用函数赋值，何来编译时常量一说
//编译时常量只能在函数之外定义，就可在编译期间初始了


const val PI = 3.14 //定义编译时常量

//todo:查看编译和反编译java代码的步骤：tools-->kotlin-->show kotlin bytecodes

fun main(){
    //这是只读的变量，并非常量
    val a = "adada"
    val num:Int = 100
    println(num)
    //提示：修饰符const不适用于 局部变量
    //const val PI = 3.14
}