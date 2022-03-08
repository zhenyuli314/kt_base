package com.lzy.s3

/**
 *
 */
fun main() {
    val sourcePwd = "abcdefghijklmnopqrstuvwxyz"
    println("原始密码是：$sourcePwd")

    //加密操作  第一个参数是正则表达式（用于选取范围），第二个参数是一个函数对象（用于设置映射）
    val newPwd = sourcePwd.replace(Regex("[abcd]")){
        when(it.value){
            "a"->"1"
            "b"->"2"
            else -> "3"
        }
    }
    println(newPwd)
}