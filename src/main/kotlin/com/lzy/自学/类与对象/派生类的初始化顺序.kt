package com.lzy.自学.类与对象

class 派生类的初始化顺序 {
}

open class Base(val name: String) {
    init {
        println("Initializing Base")
    }

    open val size: Int = name.length.also { println("Initializing size in Base: $it") }
}

class Derived(
    name: String,
    val lastName: String,
) : Base(name.capitalize().also {  println("Argument for Base: $it")  }) {
    init {
        println("Initializing Derived")
    }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}

/**
 * 基类构造函数执⾏时，派⽣类中声明或覆盖的属性都还没有初始化。
 * 设计⼀个基类时，应该避免在构造函数、属性初始化器或者 init 块中使⽤ open 成员。
 */
fun main(){
    Derived("aaa","bb")
}