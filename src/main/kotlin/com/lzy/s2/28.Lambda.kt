package com.lzy.s2

/**
 * Lambda == 匿名函数
 */
fun main() {
    val weekGet = {num:Int->
        when(num){
            1->"星期1"
            2->"星期2"
            3->"星期3"
            else->1
        }
    }// (Int)->Any
    println(weekGet(2))
    println(weekGet(4))

}