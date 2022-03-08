package com.lzy.自学.类与对象

import org.junit.jupiter.api.Test

/**
getter和setter是否一定与属性相关联，答案是否定的。

getter是从对象中获取特定的值，这个值完全可能是每次访问时临时计算的，也可能从其他对象那里得到的；

setter也可能是设置其他的对象；
 */
class 属性 {
//    var allByDefault: Int? // 错误: 需要一个初始化语句, 默认实现了 getter 和 setter 方法
    var initialized = 1    // 类型为 Int, 默认实现了 getter 和 setter
//    val simple: Int?       // 类型为 Int ，默认实现 getter ，但必须在构造函数中初始化
    val inferredType = 1   // 类型为 Int 类型,默认实现 getter


    lateinit var subject:String

    val name:String="123"
    @Test
    fun test() {
        val name :String

        subject="asdaf"
        println(subject.length) // 直接解引⽤
    }
}

/**
 * 幕后字段 field
 */
class Person(val name:String){
    var nameHash:Int = 3
        get() {
            field = 5  //在getter方法中，field就是nameHash
            return 10
        }
    fun out(){
        println(nameHash)
    }
}
fun main(args: Array<String>) {

    val ts = Person("lxx")
    println(ts.nameHash) //这里还是调用的getter方法
    ts.out()
}

/**
 * 幕后属性
 *
 */
class Demo{
    private var _size:Int = 0 //对内为读写
    val size get() = _size  //对外为只读
}
