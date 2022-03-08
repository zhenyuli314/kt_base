package com.lzy.s3

fun main() {
    var name:String? = "123"
    name = null

    /**
     * name是可空类型的
     * 如果真的是null，则 ?. 后面的代码不执行，就不会引发空指针异常
     */
    var length = name?.length
}