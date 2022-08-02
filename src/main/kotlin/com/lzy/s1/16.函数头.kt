package com.lzy.s1

// TODO: 2021/12/15 函数头  
fun main() {
    println(method01(11, "zhangsan"))
}

private fun method01(age: Int, name: String): Int {
    println("你的姓名是${name},年龄是${age}")
    return 200
}


/**
 * java版本
private static final int method01(int age, String name) {
    String var2 = "你的姓名是" + name + ",年龄是" + age;
    System.out.println(var2);
    return 200;
}
 */