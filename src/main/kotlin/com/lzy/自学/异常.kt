package com.lzy.自学

import org.junit.jupiter.api.Test

class 异常 {
    @Test
    fun `Try是一个表达式`(){
        /**
         * try -表达式的返回值是 try 块中的最后⼀个表达式或者是（所有） catch 块中的最
        后⼀个表达式。 finally 块中的内容不会影响表达式的结果。
         */
        val a :Int? = try {
            "123x".toInt()
        }catch (e: Exception){
            null
        }
        println(a)

    }

    /**
     * throw 表达式的类型是 Nothing 类型。 这个类型没有值，⽽是⽤于标记永远不能达到
    的代码位置。 在你⾃⼰的代码中，你可以使⽤ Nothing 来标记⼀个永远不会返回的函
    数：
     */
    @Test
    fun `Nothing 类型`(){
        val str:String? = null
        //当你调⽤该函数时(fail)，编译器会知道在该调⽤后就不再继续执⾏了
        val s = str?.length ?: fail("err")
        println(s)// 在此已知“s”已初始化
        println("2131")
    }
    fun fail(msg : String):Nothing{
        throw Exception(msg)
    }
}