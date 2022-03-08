package com.lzy.自学

/**
 * @author lzy
 * 空安全，在类型后面加‘？’
 */
fun main() {
    val res = method(null)
    val res2 = method(100)
    println(res)
    println(res2)

    println("----------------?.---------------------------")
    method1()

    println("-----------------?:---------------------------")
    method2()

    println("---------------------!!非空断言-------------------------------")
    method3()
}

fun method(a: Int?): Int {
    if (a == null) {
        println("null")
        return 0
    } else {
        return a
    }
}

/**
 * -------------------？. 安全调用---------------------------
 */
fun method1() {
    val a: String? = null
    val b: String? = "kt"
    println(a?.length)
    println(b?.length)
}

/**
 * -------------------Elvis表达式 ?:--------------------------------
 */
fun method2() {
    val b: String? = null
    //用if表达式
    val a: Int = if (b != null) b?.length else -1
    //用Elvis表达式，左侧为null才会执行右侧
    val aa: Int = b?.length ?: -1
    println("a:${a},aa:${aa}")
}
/**
 * ---------------------!!非空断言-------------------------------
 */
fun method3(){
    val a:String? = null
    val b = a!!.length //如果为null，会报空指针异常
    println(b)

}