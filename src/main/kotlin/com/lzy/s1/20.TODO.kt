package com.lzy.s1

// TODO: 2021/12/15 Nothing类型特点（自定义抛出异常throw）：使用        TODO("报错信息")，在编译后会转为 java的throw("报错信息")
fun main() {
    show(-1)
}

private fun  show(number:Int){
    when(number){
        -1-> TODO("没有这种情况")//nothing 在TODO里面: public inline fun TODO(reason: String): Nothing = throw NotImplementedError("An operation is not implemented: $reason")
        in 0..49-> println("不及格")
        in 50..100-> println("及格")
    }
}


//=============================================================================================
interface A{
    fun method()
}
class AImp : A{
    override fun method() {
        //下面这句话，不是注释提示，会终止程序的
        TODO("Not yet implemented")
    }
}