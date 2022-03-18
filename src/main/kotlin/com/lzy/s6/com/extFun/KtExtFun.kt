package com.lzy.s6.com.extFun

/**
 * 1.扩展文件一般都是public，如果private外界无法使用
 * 2.Iterable<T> 子类 set、list都可以使用，所以使用它
 * 3.本次扩展函数的作用是，随机取第一个元素返回
 */
fun <T> Iterable<T>.randomValue() = this.shuffled().first()