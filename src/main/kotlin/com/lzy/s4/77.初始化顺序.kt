package com.lzy.s4
//第一步：属性赋值。val sex:Char
class KtBase77(_name:String, val sex:Char){

    //第二步：属性赋值。生成val mName。属性赋值 和 init是同级，执行顺序和书写顺序一致
    val mName = _name

    //第三步：执行init代码块。生成nameV
    init {
        val nameV = _name
        println("init代码块打印：nameV:$nameV")
    }

    //第四步：生成次构造的细节
    constructor(name:String,sex:Char,age:Int):this(name,sex){
        println("次级构造函数：name:$name,sex:$sex,age:$age")
    }
}

fun main() {
    KtBase77("lzy",'男',25)
}