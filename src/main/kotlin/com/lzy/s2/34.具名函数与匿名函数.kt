package com.lzy.s2

fun main() {
    //匿名函数
    show("lzy",25){
        println(it)
    }
    //具名函数
    show("lzy",25,::resultShowFun)
}

fun show(name:String,age:Int,resultShow:(String)->Unit){
    val info = "name:$name+age$age"
    resultShow(info)
}

fun resultShowFun(info:String){
    println(info)
}