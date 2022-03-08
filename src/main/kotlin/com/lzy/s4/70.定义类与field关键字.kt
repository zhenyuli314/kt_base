package com.lzy.s4

class Abc {
    /**
     * name反编译为java时，是private的，只能通过get、set调用
     * 看一看java的反编译语句
     */
    var name = "lzy"
        //下面的set和get默认就有，一般不写。但也可以重写get，set方法
//        get() = field
//        set(value) {
//            field = value
//        }
        //重写get、set
        get() = field.capitalize()
        set(value) {
            field = value.capitalize()
        }
    val info
        get() = "123"
}

fun main() {
    var abc = Abc()
    println(abc.name) //实际调用了get方法
    abc.name = "lc"   //实际调用了set方法
    println(abc.name)

    println(abc.info)
}