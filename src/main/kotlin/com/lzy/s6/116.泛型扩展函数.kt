package com.lzy.s6

/**
 * 泛型扩展函数比超类扩展函数可用的情况更多
 */
fun <T> T.extAction() = println("不是所有的类型都是Any的子类，但是所有的类型都是泛型的一种：$this")

fun action1() = {}

fun main() {
    "abc".extAction()
    false.extAction()
    Unit.extAction()
    action1().extAction()
    //...
}