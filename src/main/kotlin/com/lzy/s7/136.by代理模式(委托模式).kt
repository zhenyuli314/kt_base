package com.lzy.s7

/**
 * by-子句表示printer将会在Proxy中内部存储，
 * 并且编译器将生成转发给printer的所有Printer的方法。
 */
interface Printer{
    fun printFun()

    fun method2()
}

class RealPrinter:Printer{
    override fun printFun() {
        println("真正的打印者")
    }

    override fun method2() {
        println("额外的方法")
    }
}

class Proxy (printer: Printer) : Printer by printer

fun main() {
    var realPrinter = RealPrinter()
    var proxy = Proxy(realPrinter)
    proxy.printFun()
}
