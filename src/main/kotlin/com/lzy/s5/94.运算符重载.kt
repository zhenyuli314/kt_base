package com.lzy.s5

/**
 * operator是操作符重载
 */
data class KtBase94(var num: Int) {
    operator fun plus(k: KtBase94): Int {
        //this.num + k.num
        return num + k.num
    }
}

fun main() {
    //+号左边是本身，+号右边是参数k
    println(KtBase94(1) + KtBase94(2))
    println(1 + 1)
}