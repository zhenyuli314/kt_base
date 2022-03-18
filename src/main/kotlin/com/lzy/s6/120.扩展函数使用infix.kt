package com.lzy.s6

/**
 * 泛型扩展函数 + infix 自定义的中缀表达式
 */

private infix fun <I,O> I.gogogo(o:O){
    //一些其他的操作
    println("我们的中缀表达式，第一个参数是：$this")
    println("我们的中缀表达式，第二个参数是：$o")
}
//infix==中缀表达式  可以简化代码
fun main() {
    //下面是map的中缀表达式
    mapOf("零".to(0))
    mapOf("一" to 1)
    mapOf("二" to 2)
    mapOf("三" to 3)

    //这里是我们自定义的中缀表达式
    "abc" gogogo 123
}