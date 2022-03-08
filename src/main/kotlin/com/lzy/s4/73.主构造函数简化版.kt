package com.lzy.s4

/**
 * var name:String 就相当于 var name = _name  这不过你看不到而已
 * 一步到位，不像我们上一篇是分开写的
 */
class KtBase73(var name:String,val age:Int){
    fun show(){
        println(name)
        println(age)
    }
}

fun main() {
    val base73 = KtBase73("lc", 24)
    base73.show()
}