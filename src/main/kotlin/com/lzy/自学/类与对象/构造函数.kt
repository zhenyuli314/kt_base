package com.lzy.自学.类与对象

/**
 * 主构造函数。如果有权限修饰符或者注解，则需要使用constructor修饰。否则可省略constructor
 */
class 构造函数(val name:String,val sex:String) {

    /**
     * 所有初始化块与属性初始化器中的代码都会在次构造函数体之前执⾏。
     */
    val firstProperty = "First property: $name".also(::println)
    init {
        println("Init block")
    }

    /**
    次构造函数里面必须包括主构造函数的参数(不用管顺序)
    每个次构造函数需要委托给主构造函数，委托到同⼀个类的另⼀个构造函数⽤ this 关键字即可：
     */
    constructor(name:String,age:Int,sex: String):this(name,sex){
        println(name+age+sex)
    }
}

fun main() {
    /**
     * 创建⼀个类的实例，只需像普通函数⼀样调⽤构造函数：
     */
//    构造函数("zhansan","男")
    构造函数("zhansan",28,"男")
}