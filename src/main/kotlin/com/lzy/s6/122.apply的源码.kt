package com.lzy.s6

/**
 * 参考博客。T.() 和 （T）的区别
 * https://www.jianshu.com/p/d067feb8593d
 */
fun main() {
    val str = "asd".mApply {
        println(this)
    }.mApply {
        println("hhhh")
    }
}

inline fun <T> T.mApply(block:T.()->Unit):T{
    block()
    return this
}