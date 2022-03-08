package com.lzy.自学.类与对象

class 覆盖规则 {
}

/**
 * 可以同时继承 Rectangle 与 Polygon ， 但是⼆者都有各⾃的 draw() 实现，所以必须
   在 Square 中覆盖 draw() ， 并为其提供⼀个单独的实现以消除歧义
 */
open class Rectangle {
    open fun draw() { /* …… */ }
}
interface Polygon {
    fun draw() { /* …… */ } // 接⼝成员默认就是“open”的
}

class Square():Rectangle(),Polygon{
    override fun draw() {
        super<Rectangle>.draw()
        super<Polygon>.draw()
    }
}