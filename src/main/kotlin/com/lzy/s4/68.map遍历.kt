package com.lzy.s4

fun main() {
    val map = mapOf("a" to 1,"b" to  2)
    //第一种（推荐）
    map.forEach{
        println("${it.key}:${it.value}")
    }
    //第二种
    map.forEach{k,v->
        println("$k:$v")
    }
    //第三种(推荐)
    map.forEach{ (k, v) ->
        println("$k:$v")
    }
    //第四种
    for (entry in map) {
        println("${entry.key}:${entry.value}")
    }
}