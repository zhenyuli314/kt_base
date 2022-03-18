package com.lzy.s6

//导入自定义扩展文件
//as 可以对名字长的函数进行重命名，非常好用
import com.lzy.s6.com.extFun.randomValue as rv

fun main() {
    val list = listOf(1,2,3)
    val set = setOf("a","b","c")
    //使用自定义扩展文件
    println(list.rv())
    println(set.rv())
}