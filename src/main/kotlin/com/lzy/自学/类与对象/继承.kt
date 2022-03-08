package com.lzy.自学.类与对象
//open修饰：此类可以被继承
open class 继承(val name:String) {
    /**
     * 1.在 Kotlin 中所有类都有⼀个共同的超类 Any ，对于没有超类型声明的类它是默认超类。对比java的object
     * 2.默认情况下，Kotlin 类是最终（final）的——它们不能被继承。 要使⼀个类可继承，请⽤ open 关键字标记它：
     * 3.kt中的继承使用 ： 对比java的 extends
     */

    open fun draw() { /*……*/ }
    fun fill() { /*……*/ }

    open val vertexCount: Int = 0
}

/**
 * 1.如果父类有⼀个主构造函数，子类可以（并且必须）根据其参数在该主构造函数中初始化。
 * 2.可以在主构造函数、次构造函数中 初始化父类
 */
//1.主构造函数中
class son2 : Any() {
}
//2.次构造函数中
class son: 继承 {
    constructor(name: String) : super(name)

    /**
     * 覆盖方法
     */
    override fun draw() {
        /*……*/
    }

    /**
     *  如果函数没有标注 open 如 Shape.fill() ，那么⼦类中不允许定义相同签名的函数， ⽆论加不加 override 。
     */
//    fun fill(){}
//    override fun fill(){}


    /**
     * 覆盖属性
     * 1.每个声明的属性可以由具有初始化器的属性或者具有 get ⽅法的属性覆盖
     * 2.可以⽤⼀个 var 属性覆盖⼀个 val 属性，但反之则不⾏.因为⼀个 val 属性本质上声明了⼀个 get ⽅法， ⽽将其覆盖为 var 只是在⼦类中额外声明⼀个 set ⽅法。
     * 3.可以在主构造函数中使⽤ override 关键字作为属性声明的⼀部分(放在主构造器中)
     */
    override val vertexCount: Int = 123

}


