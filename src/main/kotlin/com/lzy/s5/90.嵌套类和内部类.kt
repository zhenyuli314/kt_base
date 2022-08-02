package com.lzy.s5

/**
 * 类 A 在类 B 内部声明                在 Java 中                在 Kotlin 中

嵌套类 (不能直接访问外部类私有属性)     static class A              class A
内部类 (能直接访问外部类私有属性)          class A                 inner class A

 */

class Body(val bodyInfo: String) {

    fun show() {
        println()
    }

    //默认情况下：内部的类不能访问外部的类
    class Heart1 {
        val name = "Heart1"
        fun run() {
//            println("心脏访问身体信息：$bodyInfo")
        }
    }

    //要增加修饰符 innner 成为内部类才可以访问外部类
    inner class Heart2 {
        val name = "Heart2"
        fun run() {
            println("心脏访问身体信息：$bodyInfo")
        }
    }
}