package com.lzy.s6

open class MyAnyClass(val name:String) //顶级父类

open class PersonClass(name:String) : MyAnyClass(name) //父类

class StudentClass(name:String) : PersonClass(name) // 子类

class TeacherClass(name:String) : PersonClass(name)// 子类

class DogClass(name: String) //其他类

class KtBase106<T:PersonClass>(private  val inputValue:T,private val isR:Boolean=true){
    fun getObj() = inputValue.takeIf { isR }
}

fun main() {
    var myAnyClass = MyAnyClass("asd")
    var personClass = PersonClass("asd")
    var TeacherClass = TeacherClass("asd")
    var StudentClass = StudentClass("asd")
    var DogClass = DogClass("asd")

//    var r1 = KtBase106(myAnyClass).getObj()
    var r2 = KtBase106(personClass).getObj()
    var r3 = KtBase106(TeacherClass).getObj()
    var r4 = KtBase106(StudentClass).getObj()
//    var r5 = KtBase106(DogClass).getObj()
}