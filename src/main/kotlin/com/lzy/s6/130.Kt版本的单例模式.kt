package com.lzy.s6

/**
 * 相当于Java的双重空判单例模式
 * by lazy的使用要清楚（懒加载）
 */

class SingletonClass private constructor(){
    companion object{
        val instance:SingletonClass by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) { SingletonClass() }
    }
    fun show(){
        println("show")
    }
}

fun main() {
    SingletonClass.instance.show()
}