package com.lzy.s6

/**
 * String 不可空类型
 * String？ 可空类型的
 */

//对String？ 可空类型进行函数扩展，并且有备用值
fun String?.extFun(defaultValue:String) = println(this?:defaultValue)

//返回值有默认值的话，一定不会返回null，所以返回值类型为String
fun String?.extFun2(defaultValue: String):String = this ?: defaultValue

fun main() {
    val info:String?=null

    val info2 = "abc"

    info.extFun("我是默认值")
    info2.extFun("我是默认值")
}