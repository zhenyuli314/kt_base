package com.lzy.s3

import java.io.File

/**
 * info.apply特点：apply函数始终是返回”info本身“，所以可以链式调用
 * 在apply内部没有it，但有this。实际使用中可以使用：info，this或者省略不写
 */
fun main() {
    val info = "ABCDEFG"
    var apply = info.apply {
        println("长度是:${this.length}")
        this.replace("A", "0")

    }.apply {
        println("最后一个字符是：${info[info.length - 1]}")
    }.apply {
        println("全部转成小写:${info.toLowerCase()}")
    }
    println(apply)


    /**
     *   另一个例子
     */
    //一般写法
    val file = File("D:/a.txt")
    file.setExecutable(true)
    file.setReadable(true)
    println(file.readLines())
    //apply写法
    file.apply {
        setExecutable(true)
    }.apply {
        setReadable(true)
    }.apply {
        println(readLines())
    }

}