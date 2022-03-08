package com.lzy.s4

class KtBase76(name: String) {
    /**
     * 这个不是java的 static{}
     * 而是相当于Java的 {} 构造代码块
     * 经常做一些参数校验等工作
     */
    init {
        println("init代码块会拼接到主构造函数的后面！")
    }
    constructor(name: String, age: Int) : this(name) {
        println("2个参数的次构造函数被调用。。。")
    }

    fun show(){
//        println(name)//临时参数，用不了。需要二次转换
    }
}

fun main() {
    KtBase76("lzy")
    println()
    KtBase76("lzy",12)
}