package com.lzy.s2

/**
 * Lambda == 匿名函数
 * Kotlin 使用类似 (Int) -> String 的一系列函数类型来处理函数的声明:
所有函数类型都有一个圆括号括起来的参数类型列表以及一个返回类型：(A, B) -> C 表示接受类型分别为 A 与 B 两个参数并返回一个 C 类型值的函数类型。 参数类型列表可以为空，如 () -> A。Unit 返回类型不可省略。
函数类型可以有一个额外的接收者类型，它在表示法中的点之前指定： 类型 A.(B) -> C 表示可以在 A 的接收者对象上以一个 B 类型参数来调用并返回一个 C 类型值的函数。 带有接收者的函数字面值通常与这些类型一起使用。（函数体内，this是A，it是B）
挂起函数属于特殊种类的函数类型，它的表示法中有一个 suspend 修饰符 ，例如 suspend () -> Unit 或者 suspend A.(B) -> C

 */
fun main() {
//    val weekGet = {num:Int->
//        when(num){
//            1->"星期1"
//            2->"星期2"
//            3->"星期3"
//            else->1
//        }
//    }// (Int)->Any
//    println(weekGet(2))
//    println(weekGet(4))


    val argFun : Person.(String)->String ={
        println(it)
        "123"
    }
    println(argFun(Person("lzy"),"arg2"))
}

class Person(var name:String)
