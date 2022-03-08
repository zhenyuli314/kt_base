package com.lzy.s3

/**
 * 一般with函数被run函数代替使用
 */
fun main() {
    val str = "abcdefg"
    var i = with(str, ::getLen)
    var s = with(i, ::getInfo)
    with(s,::println)
}
fun getLen(str:String):Int{
    return str.length
}

fun getInfo(len:Int):String{
    return "这个字符的长度为:$len"
}
