package com.lzy.s2
//todo 23.匿名函数的学习
fun main() {
    var count = "lzzzy".count()
    println(count)

    //匿名写法1(完整版)
    //这里是声明
    var predicate:  (Char) -> Boolean = {
        it == 'z' //匿名函数只有一个入参时，可以省略参数名，使用it关键字
    }
    //这里是调用
    var count1 = "lzzzy".count(predicate)
    println(count1) //3

    //匿名写法2(简化版)声明+调用
    var count2= "lzzzy".count {
        it=='z'
    }
    println(count2)//3
}