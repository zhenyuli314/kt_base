package com.lzy.s4

class KtBase74(var name: String, var age: Int) {

    //2个参数的次构造函数，必须要调用【主构造函数】或【其他次构造函数】，否则不通过。
    constructor(_name: String) : this(_name,10) {
        println("2个参数的次构造函数:$_name,$age")
    }


    constructor(name: String, age: Int, sex: Char) : this(name) {
        println("3个参数的次构造函数")
    }

    fun show() {
        println(name)
        println(age)
    }
}

fun main() {
//    KtBase74("lzy1")  //主构造函数
    var base74 = KtBase74("lzy2", 25) //2个参数的次构造函数
    base74.show()
//    KtBase74("lzy3",25,'男') //3个参数的次构造函数
}