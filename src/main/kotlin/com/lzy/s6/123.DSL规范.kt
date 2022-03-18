package com.lzy.s6

class Context{
    val info = "我就是lzy"
    val name = "DDD"

    fun toast(str:String) = println("toast:$str")
}

/**
 * 其实apply5就是DSL规范，定义输入输出等规则
 * 1。定义整个lambda规则标准，输入 必须是Context这个类，才有资格调用apply5函数，匿名函数里面持有it 和 this
 * 2。定义整个lambda规则标准，输出 我们会始终返回Context本身，所以你可以链式调用
 * 然后main函数就可以根据DSL编程方式标准规则，来写具体的实现，这就是DSL编程规范
 */
inline fun Context.apply5(block: Context.(String)->Unit):Context{
    block(info)
    return this
}

fun main() {
    Context().apply5 {
        toast("这就是this：$this")
        toast("这就是it：$it")
    }
}