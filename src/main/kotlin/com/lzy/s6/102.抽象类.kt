package com.lzy.s6

/**
 * 1.
 * 不能同时继承两个抽象类，会报错。
 * 但是可以同时继承多个接口
 */
abstract class Base{
    fun show1(){
        show2("asd")
    }
    private fun show2(name:String){
        println(name)
    }

    /**
     * 2.这也是抽象类和接口的一点区别。可以直接对普通属性赋值
     */
    val propertu3:String = "ad"

    abstract val propertu1:String
    abstract val propertu2:String
    abstract fun showImp1()
    abstract fun showImp2()
}

abstract class Base2{}

class Imp1:Base(){
    override val propertu1: String
        get() = "属性1"
    override val propertu2: String
        get() = "属性2"

    override fun showImp1() {
        println("实现类方法1")
    }

    override fun showImp2() {
        println("实现类方法2")
    }
}

fun main() {
    Imp1().show1()
    Imp1().showImp1()
}