package com.lzy.s6

fun main() {
    //下面是Java与Kt的交互，错误的案例
    println(KtBase129().info1.length)
    println(KtBase129().info2.length)

    //下面是Java与Kt的交互，错误的案例
    //String! Java与Kt交互的时候，Java给Kt用的值，都是 String! 这种类型
    val info1 = KtBase129().info1
    val info2 = KtBase129().info2
    println(info1)
    println(info2)

    //下面是Java与Kt交互，正确的案例1
    //String! Java与Kt交互的时候，Java给Kt用的值，都是 String! 这种类型
    //只要看到有 String! 的类型，在使用的时候，必须 ?.xxx
    val info1s = KtBase129().info1
    val info2s = KtBase129().info2
    println(info1s?.length)
    println(info2s?.length)

    //下面是Java 与 Kt 交互，正确的案例2（推荐）
    //只要是看到有 String! 的类型，在使用的时候，必须用 String? 来接受Java值，使用时候用 ?.xxx
    val info1ss : String? = KtBase129().info1
    val info2ss : String? = KtBase129().info2
    println(info1ss?.length)
    println(info2ss?.length)
}