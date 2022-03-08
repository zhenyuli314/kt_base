package com.lzy.s6

import kotlin.reflect.typeOf

fun <T> show(item:T){
    item?.run {
        println("item是$item")
    }
}

/**
 * 类型转换，I-->O
 */
inline fun <I,O> map(input:I, isAction:Boolean = true ,mapAction:(I)->O) = if (isAction) mapAction(input) else null

fun main() {
    show(1)

    //--------------------------------------------------------------
    val res :String?= map(123){
        it.toString()
    }
    println(res)
    println(res is String)
}