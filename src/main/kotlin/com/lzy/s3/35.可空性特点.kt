package com.lzy.s3

fun main() {

    /**
     * 第一种情况：默认是不可空类型，不能随意给null
     */
    var name :String = "asd"
    //提示：Null can not be a value of a non-null type String
//    name = null

    /**
     * 第二种情况：声明时指定为可空类型
     */
    var name2 :String? = "324"
    name2 = null
}