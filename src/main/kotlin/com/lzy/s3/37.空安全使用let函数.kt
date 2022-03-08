package com.lzy.s3

fun main() {
    /**
     * 1.let函数的普通使用，就是执行一个代码块
     */
    var name = "123"

    name.let {
        println(it)
    }

    /**
     * 2。空安全调用+let函数
     */
    var name2 : String? = "1231"
//    name2 = null
    //如果name2为 null，则let里面的代码不执行。value的值为null 。  实战中使用频繁
    val value = name2?.let {
        if (it.isBlank()){
            "Default"
        }else{
            "it:$it"
        }
    }
    println(value)
}