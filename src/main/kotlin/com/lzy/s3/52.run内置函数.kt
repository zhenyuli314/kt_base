package com.lzy.s3

fun main() {
    val str ="123456"
    str.run(::isLong).run(::showText).run(::mapText).run(::println)
    str.let(::isLong).let(::showText).let(::mapText).let(::println)
}

fun isLong(str:String):Boolean{
    return str.length>5
}

fun showText(boolean: Boolean):String{
    return if (boolean) "合格" else "不合格"
}

fun mapText(str:String):String{
    return "[$str]"
}