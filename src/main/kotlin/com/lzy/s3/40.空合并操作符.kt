package com.lzy.s3

/**
 * 空合并操作符 xxx?:"原来是null啊"  如果xxx等于null,就会执行 ?: 后面的区域
 */
fun main() {
    var info :String?="lzy"
    info = null

    println(info?:"原来是null啊")

    println(info?.let { "[$it]" }?:"原来是null啊2")
}