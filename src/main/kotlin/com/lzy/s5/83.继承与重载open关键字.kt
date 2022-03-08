package com.lzy.s5

 open class Person(val name:String){
    open fun showName() : String{
        return "父类的name是$name"
    }

    fun printMethod(){
        println(showName())
    }
}

class Student(val subName: String) :Person(name = subName){
    override fun showName(): String {
        return "子类的name是$subName"
    }
}

fun main() {
    val student = Student("lzy")
    val person = Person("lzy")
    val stu:Person = Student("lzy") //多态

    student.printMethod()
    person.printMethod()
    stu.printMethod()
}