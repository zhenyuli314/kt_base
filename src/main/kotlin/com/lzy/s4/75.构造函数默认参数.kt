package com.lzy.s4

class KtBase75(name:String = "lzy1"){
    //2个参数的次构造函数，必须要调用【主构造函数】或【其他次构造函数】，否则不通过。
    constructor(name:String="lzy1",age:Int = 23):this(name){
        println("2个参数的次构造函数")
    }

    constructor(name:String,age:Int,sex:Char):this(name){
        println("3个参数的次构造函数")
    }

    fun show(){
//        println(name)//临时的输入类型，不能直接用
//        println(age)//临时的输入类型，不能直接用
    }
}

fun main() {
    KtBase75()  //到底是调用哪一个构造函数？ 优先调用主构造函数
}