package com.lzy.s2
//todo:函数类型和隐式返回
fun main() {
//    第一步:函数输入输出的声明
    val methodAction:(String,Int)->String = {name,age->
        //    第二步：对上面函数的实现
        val inputValue = 2131
        "asd + $name + $age"
        //   *匿名*   函数不写return，最后一行就是返回值
    }

    //第三步：调用此函数
    println(methodAction("lzy",25))
    println(methodAction())
}

fun methodAction():String{
    return "asd"
}