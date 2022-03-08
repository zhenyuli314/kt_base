package com.lzy.s6

open class MyAnyClass(val name:String) //顶级父类

open class PersonClass(name:String) : MyAnyClass(name) //父类

class StudentClass(name:String) : PersonClass(name) // 子类

class TeacherClass(name:String) : PersonClass(name)// 子类

class DogClass(name: String) //其他类

class KtBase106<T>(private  val inputValue:T,private val isR:Boolean=true){
    fun getObj() = inputValue.takeIf { isR }
}

fun main() {
    var myAnyClass = MyAnyClass("asd")
    var personClass = PersonClass("asd")
    var TeacherClass = TeacherClass("asd")
    var StudentClass = StudentClass("asd")
    var DogClass = DogClass("asd")
}