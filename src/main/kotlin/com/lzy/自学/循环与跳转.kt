package com.lzy.自学

import org.junit.jupiter.api.Test

class `循环与跳转` {
    @Test
    fun `for循环`() {
        for (i in 1..3) {
            for (j in 1..10) {
                if (j % 2 == 0) {
                    println(j)
                }
            }
        }

        val arr = arrayOf(1, 2, 3)
        for ((index, value) in arr.withIndex()) {
            println("$index:$value")
        }
    }

    /**
     * 标签限定的 break 跳转到刚好位于该标签指定的循环后⾯的执⾏点。 continue 继续标签指定的循环的下⼀次迭代。
     */
    @Test
    fun `Break 与 Continue 标签`() {
        for (i in 1..3) {
            loop@ for (j in 1..5) {
                if (j == 5) {
                    break@loop
                } else {
                    println(j)
                }
            }
        }

    }

    /**
     * 如果不用标签返回的话，会直接返回到改循环所在函数的 调用者（即弹出循环所在函数的栈帧）
     */
    @Test
    fun `返回到标签`(){
        listOf(1,2,3,4).forEach {
            if (it==3)return@forEach // 局部返回到该 lambda 表达式的调⽤者——forEach 循环
            println(it)
        }
    }
}