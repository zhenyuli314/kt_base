package com.lzy.s6

//对顶级父类进行扩展，则它的子类都具有该功能了
//用户的扩展函数不允许重复定义；但是如果是对源码的扩展函数重复定义，则会覆盖。
fun Any.extendAction() = println("扩展的功能，打印信息如下：$this")

fun main() {
    "ABC".extendAction()
    123.extendAction()
    123.23f.extendAction()
    13.1312.extendAction()
    'T'.extendAction()
    KtBase114("lzy",24,'n').extendAction()
}