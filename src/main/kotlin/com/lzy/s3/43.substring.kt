package com.lzy.s3


const val INFO = "lzy is a student"
fun main() {
    var indexOf = INFO.indexOf("i")
    //注意until的使用
    println(INFO.substring(0 until indexOf))
}