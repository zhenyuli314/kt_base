package com.lzy.s6
//协变out get只能读取，不能修改
class KtBase111<out T>(private val item:T){
    fun get(): T? {
        return item
    }

    //会编译不通过
//    fun set(value:T){
//        println("set 得到一个值：$value")
//    }
}

//逆变in，set追只能修改，不能给外界获取
class KtBase112<in T>(private var item:T){
    fun set(item:T){
        this.item = item
    }

    //同样，编译不通过
//    fun get():T?{
//        return null
//    }
}