package com.lzy.s1
//todo: String模板
fun main() {
    val garden = "黄石公园"
    val time = 6

    println("今天去${garden}玩了${time}小时")

    val isLogin = true
    //Kt的if是表达式，所以可以更灵活。java的if是语句，还有局限性。表达式和语句的区别（百度）。表达式是语句的一部分，有返回值
    println("server response result :${if(isLogin)"登录成功" else "未登录"}")

    val newGarden = "${garden.replace("黄石","中央")},这是新增加的"
    println(newGarden)
}