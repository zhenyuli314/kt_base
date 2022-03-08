package com.lzy.s2

fun main() {
    val methodShows = methodShow("学习哈哈哈哈")
    println(methodShows("lzy", 25))
}

fun show(info:String){
    println("我是show函数:$info")
}

fun show2(info: String):String{
    println("我是show2函数:$info")
    return "show2函数的返回值"
}

fun methodShow(info: String):(String,Int)->String{
    println("我是methodShow函数:$info")
    return {name:String,age:Int->
        "我是匿名函数：我的name是$name,age是$age"
    }
}