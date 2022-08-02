package com.lzy.s6

/**
 * 1.接口里面的所有成员和接口本身都是 public open的
 * 2.接口不能有主构造
 * 3.实现类不仅仅要重写接口的函数，还得重写属性。并用override关键字
 */

interface IUSB{
    fun show1(){
        show2("asd")
    }
    private fun show2(name:String){
        println(name)
    }

    var name:String
    var version:String
    fun insertUSB():String
}
//推荐写法
class Mouse( override var name: String = "mouse", override var version: String="1.2") :IUSB{
    //此构造函数
    constructor(a:String) : this(a,"123"){
        println(a)
    }

    override fun insertUSB() : String = "接入了 $name, 版本是 $version"
}


class KeyBoard :IUSB{
    override var name:String = ""
        get() = "KeyBoard"
        set(value) {
            field = value
        }
    override var version:String = ""
        get() = "2.0"
        set(value) {
            field = value
        }
    override fun insertUSB() : String = "接入了 $name, 版本是 $version"
}

fun main() {
    println(Mouse().insertUSB())

    println(KeyBoard().insertUSB())

}