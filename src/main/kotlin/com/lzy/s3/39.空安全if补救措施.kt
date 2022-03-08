package com.lzy.s3

fun main() {
    var name : String? = "1231"

//报错：Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    //println(name.length)

    if (name!=null){
        println(name.length)
    }
}