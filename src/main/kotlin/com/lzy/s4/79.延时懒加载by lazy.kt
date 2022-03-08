package com.lzy.s4

/**
 * lateInit 是在使用的时候，手动加载的懒加载方式，然后再使用
 * by lazy  是在使用的时候，自动加载的懒加载方式，然后再使用
 */

class KtBase79 {
    //非懒加载
//    val result1 = getMyResult()

    //懒加载
    val result2 by lazy { getMyResult() }

    private fun getMyResult(): String {
        println("加载中。。。")
        println("加载中。。。")
        println("加载中。。。")
        return "加载成功"
    }
}

fun main() {
    var base79 = KtBase79()
    Thread.sleep(2000)

    /**
     * 体验getMyResult的执行时机：
     */
//    println(base79.result1)  //在var base79 = KtBase79()时就执行
    println(base79.result2) //在这调用时才执行
}