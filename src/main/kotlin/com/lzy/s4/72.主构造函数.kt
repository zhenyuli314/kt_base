package com.lzy.s4

/**
 * 主构造函数：规范来说，都是增加_xxx的方式，临时的输入类型，不能直接用，需要接收下来，成为变量才能用
 * _name等，都是临时的类型，不能直接使用，需要转化一下
 */
class KtBase72(_name:String,_age:Int){
    var name:String = _name

    val age:Int = _age
    fun show(){
//        println(_name) //临时的输入类型，不能直接用
        println(name)
        println(age)
    }
}

fun main() {
    val base72 = KtBase72(_name = "lzy",_age = 16)
    base72.show()
}