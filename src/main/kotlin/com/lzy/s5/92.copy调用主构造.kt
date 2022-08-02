package com.lzy.s5


data class KtBase92(var name: String, var age: Int) {
    var coreInfo = ""

    init {
        println("主构造函数被调用")
    }

    constructor(name: String) : this(name, 99) {
        println("次构造函数被调用")
        coreInfo = "增加非常核心的内容信息"
    }

    override fun toString(): String {
        return "toString name:$name,age:$age,codeInfo:$coreInfo"
    }
}

fun main() {
    //调用次构造
    val p1 = KtBase92("lzy")
    println(p1)
    println()

    /**
     * p_new缺失coreInfo信息：
     *  copy生成的对象，调用的是主构造函数，次构造函数里面的东西未调用
     */
    val p_new = p1.copy()
    println(p_new)
}