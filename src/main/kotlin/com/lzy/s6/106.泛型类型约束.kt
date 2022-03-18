package com.lzy.s6

open class MyAnyClass(val name:String) //顶级父类

open class PersonClass(name:String) : MyAnyClass(name) //父类

class StudentClass(name:String) : PersonClass(name) // 子类

class TeacherClass(name:String) : PersonClass(name)// 子类

class DogClass(name: String) //其他类

/**
 * PersonClass本身 与 PersonClass的所有子类 都可以使用，其他的类，都不能兼容此泛型
 */
class KtBase106<T:PersonClass>(private  val inputValue:T,private val isR:Boolean=true){
    fun getObj() = inputValue.takeIf { isR }
}

fun main() {
    var myAnyClass = MyAnyClass("asd")
    var personClass = PersonClass("asd")
    var teacherClass = TeacherClass("asd")
    var studentClass = StudentClass("asd")
    var dogClass = DogClass("asd")
//    println(KtBase106(myAnyClass).getObj())
    println(KtBase106(personClass).getObj())
    println(KtBase106(teacherClass).getObj())
    println(KtBase106(studentClass).getObj())
//    println(KtBase106(dogClass).getObj())
}