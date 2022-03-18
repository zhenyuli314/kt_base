package com.lzy.s6

/**
 * apply，run，let等内置函数就是使用 泛型扩展函数实现的
 */

//private 私有化
//inline 我们的函数参数有lambda，所以需要inline优化，提高性能
//fun<I,O> 在函数中， 申明两个泛型，函数泛型，I输入Input，O输出Output
//I.mlet 对I输入Input进行函数扩展，意味着，所有的类型都可以使用 xxx.mlet
//block lambda参数
// :O  会根据用户的返回类型，变化而变化
// block(this) I进行函数扩展，在整个扩展函数里面，this == I本身（实例）
private inline fun <I, O> I.mlet(block: (I) -> O): O = block(this)

fun main() {
    var value: Boolean = "abc".mlet {
        true
    }
    println(value)
}
