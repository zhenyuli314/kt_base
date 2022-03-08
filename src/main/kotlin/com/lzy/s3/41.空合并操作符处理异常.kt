package com.lzy.s3

fun main() {
    //空合并操作符处理异常
    try {
        var name :String? = null
        println(name!!.length)
    }catch (e:Exception){
        println("出错了：$e")
    }

    //空合并操作符处理异常+自定义异常
    try {
        var name :String? = "null"
        checkNullException(name)
        println(name!!.length)
    }catch (e:Exception){
        println("出错了：$e")
    }
}

fun checkNullException(name: String?) {
    val nam = name?:throw MyException()
    println(nam)
}

class MyException : IllegalArgumentException("你的代码太不严谨了！")
