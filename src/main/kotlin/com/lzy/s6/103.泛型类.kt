package com.lzy.s6

class KtBase103<T>(private val obj:T){
    fun show() {
        println("万能输出器：${obj}")
    }
}

data class Student(val name:String,val age:Int)
data class Teacher(val name:String,val age:Int)

fun main() {
    KtBase103(Student("la",23)).show()
    KtBase103(Teacher("lisa",23)).show()
    KtBase103("gasdha").show()
}