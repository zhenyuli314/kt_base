package com.lzy.s3

/**
 * 地址比较时，参考jvm常量池
 */
fun main() {
    val name1 = "Abc"     //    String name1 = "Abc";
    val name2 = "Abc"     //    String name2 = "Abc";
    println(name1 == name2)  //true  相当于java的equals
    println(name1 === name2) //true   比较的是地址

    val name3 = "abc".capitalize()  //    String name3 = StringsKt.capitalize("abc");
    var intern = name3.intern()
    println(name1 === name3) //false
    println(name1 === intern) //true

    val name4 = "A" + "bc"  //    String name4 = "Abc";原理是编译期优化
    println(name1 === name4)  //true
}