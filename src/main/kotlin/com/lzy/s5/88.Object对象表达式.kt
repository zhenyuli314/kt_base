package com.lzy.s5

import org.omg.CORBA.Object

interface KtBase88 {
    fun method1()
    fun method2()
}

fun main() {
    //KT对象表达式,返回一个对象。相当于java new一个匿名类
    var obj1 = object : KtBase88 {
        override fun method1() {
            println("这是method1")
        }

        override fun method2() {
            println("这是method2")
        }
    }


    //对于Java接口或者类。Kt接口没有方法2
    //方法1：对象表达式
    object : Runnable {
        override fun run() {
            println("run方法")
        }
    }.run()
    //方法2：最简洁的方式
    Runnable {
        println("run最简洁的方式")
    }.run()
}