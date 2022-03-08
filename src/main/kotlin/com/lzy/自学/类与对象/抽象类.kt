package com.lzy.自学.类与对象

/**
 * 抽象类和普通类的区别在于抽象类除了可以有其自己的属性、构造函数、方法等组成部分，还包含了抽象函数以及抽象属性。

 抽象类的其他用法：可以⽤⼀个抽象成员覆盖⼀个⾮抽象的开放成员（open修饰的普通类）。

 */

abstract class 抽象类 {
    val TAG = this.javaClass.simpleName  // 自身的属性
    // 自身的函数
    fun test() : Unit{
        // exp
    }
    abstract var name : String           // 抽象属性
    abstract fun init()                  // 抽象方法
}

class 实现类1 : 抽象类(){
    override var name: String
        get() = "Kotlin"
        set(value) {}

    override fun init() {
        println("我是$name")
    }
}

class 实现类2 : 抽象类(){
    override var name: String
        get() = "java"
        set(value) {}

    override fun init() {
        println("我是$name")
    }
}

fun main() {
    // val 抽象类 = 抽象类() 是错误的，因为抽象类不能直接被实例化

    val 实现类1 = 实现类1()
    val 实现类2 = 实现类2()

    println(实现类1.name)
    println(实现类1.TAG)
    实现类1.init()
}