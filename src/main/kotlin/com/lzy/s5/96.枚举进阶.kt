package com.lzy.s5

//肢体的附加信息，主要属性：名称、大小
class PartInfo(val name: String, val length: Int) {
    fun show() {
        println("${name}的长度是$length")
    }
}

//肢体类
enum class BodyPart(var part: PartInfo) {
    //肢体的枚举实例。其属性为 “肢体的附加信息”
    HAND(PartInfo("手", 10)),
    FOOT(PartInfo("脚", 30)),
    LEG(PartInfo("胳膊", 50)); //结束枚举值

    //
    fun show() {
        println(part.name + "是身体的一部分，它的长度是" + part.length)
    }

    fun change(newPart: PartInfo) {
        part = newPart
    }
}

fun main() {
    //显示枚举
    BodyPart.HAND.show()

    //改变枚举的属性，然后显示
    BodyPart.HAND.apply {
        this.change(PartInfo("new手", 12))
    }.apply {
        this.show()
    }

}