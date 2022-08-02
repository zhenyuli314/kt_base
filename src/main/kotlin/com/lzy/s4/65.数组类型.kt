package com.lzy.s4

import java.io.File

/**
 * kt语言中的各种数组类型，虽然是引用类型，背后可以编译成Java基本数据类型
 * IntArray         intArrayOf
 * DoubleArray      doubleArrayOf
 * LongArray        longArrayOf
 * ShortArray       shortArrayOf
 * ByteArray        byteArrayOf
 * FloatArray       floatArrayOf
 * BooleanArray     booleanArrayOf
 * Array<对象类型>      arrayOf      对象数组
 */
//1.intArrayOf 常规操作的越界崩溃
//2.elementAtOrElese\elementAtOrNull+空合并操作符一起使用
//3.list转数组
//4.对象数组
fun main() {
    var arr = intArrayOf(1, 2, 3, 4)
    //数组转list
    var list = arr.toList()
    //list转数组
    var arr2 = list.toIntArray()

    var files : Array<File> = arrayOf(File("a"), File("b"))
}