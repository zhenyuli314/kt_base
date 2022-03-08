package com.lzy.s1
//TODO:　反引号中函数名的特点
fun main() {

    临时的单元测试("lzy",18)

    /**
     * is 和 in 在java中不是关键字，但是在kt中是关键字.所以得用反引号标记
     */
    KtBase21.`in`()
    KtBase21.`is`()
}

/**
 * 第一种用法：用于临时的单元测试
 */
private fun `临时的单元测试`(name:String,age:Int){
    println("${name}+${age}")
}

/**
 * 第二种情况：和java进行联调时，用于处理关键字冲突
 */