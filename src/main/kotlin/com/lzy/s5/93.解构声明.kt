package com.lzy.s5

/**
 * 普通类解构需要关键字operator, operator是操作符重载
 * data类则自动完成
 */

//普通类
class Student1(var name:String,var age:Int,var sex:Char){
    //注意事项：component顺序必须是component1 component2 component3 和成员一一对应，顺序下来的
    operator fun component1() = name
    operator fun component2() = age
    operator fun component3() = sex
}

//数据类
data class Student2(var name:String,var age:Int,var sex:Char)

fun main() {
    val(name,age,sex) = Student1("lc",24,'女')
    println("普通类解构后：name:$name,age:$age,sex:$sex")

    val(name1,age1,sex1) = Student2("lc",24,'女')
    println("数据类解构后：name:$name1,age:$age1,sex:$sex1")

    val(_,_,sex2) = Student2("lc",24,'女')
    println("数据类解构后：sex:$sex2")
}