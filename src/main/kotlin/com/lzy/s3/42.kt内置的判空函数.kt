package com.lzy.s3

fun main() {
    var name : String? = null

    //如果为null，二者都会报异常
    checkNotNull(name)
    requireNotNull(name)
}