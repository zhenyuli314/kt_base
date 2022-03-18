//@file:JvmName("KtBase134kt")
package com.lzy.s7

class MyObject{
    companion object{
        @JvmField
        val TARGET = "黄石公园"
        @JvmStatic //原理就是在静态内部类的外面又封装了一层调用
        fun showAction(name:String) = print("$name 要去 $TARGET")
    }
}

fun main() {
    println(MyObject.TARGET)
    MyObject.showAction("lzy")
}
