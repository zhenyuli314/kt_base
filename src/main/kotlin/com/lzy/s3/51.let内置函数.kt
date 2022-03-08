package com.lzy.s3

/**
 * 内置函数的总结
 * apply:
 *  1.apply函数返回类型，用于都是info本身
 *  2.apply函数的 匿名函数里面持有的this==info本身
 * let:(适用于处理不为null的操作场景)
 *  1.let函数返回类型，是根据匿名函数最后一行的变化而变化
 *  2.let函数的 匿名函数里面持有的是it == 集合本身
 * run:(适用于let,with函数任何场景。)
 *  1.run函数返回类型，是根据匿名函数最后一行的变化而变化
 *  2.run函数的 匿名函数里面持有的this==info本身
 * with:(with无法链式调用，其他跟run一样，一般用run代替with)
 *


通过关键字 this 引用上下文对象的：
apply 。public inline fun T.apply(block: T.() -> Unit): T 。返回值 为 扩展对象
run 。public inline fun <T, R> T.run(block: T.() -> R): R 。返回值为 函数类型的返回值
with，它不是一个扩展函数。ublic inline fun <T, R> with(receiver: T, block: T.() -> R): R 。返回值为 函数类型的返回值。

通过it 关键字引用上下文
let 。public inline fun <T, R> T.let(block: (T) -> R): R 。返回值为函数类型的返回值。
also。public inline fun T.also(block: (T) -> Unit): T。返回值为 扩展对象

 参考：https://blog.csdn.net/abs625/article/details/109074104
 this的比it的好，一般用apply和run就可以了
 */
fun main() {
    val list = listOf<Int>(1, 2, 3, 4)
    val i = list.let {
        it.first()
    }.let(::println)
//    println(i)

    println(getMethod(null))
    println(getMethod2("asd"))

}

//空值判断(完全版)
fun getMethod(value:String?):String{
    return value?.let {
        "欢迎回来${it}"
    }?:"你传递的是null"
}
//空值判断(简化版)
fun getMethod2(value:String?)=value?.let { "欢迎回来${it}" }?:"你传递的是null"