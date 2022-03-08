package com.lzy.s2

/**
 * lambda属于函数类型的对象，需要把methodResponsesResult普通函数编程 函数类型的对象（函数引用）
 */
fun main() {

    login("lzylzy","123123",::methodResponseResult)

    //函数引用返回的就是一个 函数类型的对象
    val  obj = ::methodResponseResult
    login("lzylzy","123123",obj)
}

fun methodResponseResult(msg:String,code:Int){
    println("msg:$msg==code:$code")
}

const val USER_NAME_SAVE_DB3 = "lzylzy"
const val USER_PWD_SAVE_DB4 = "123123"

fun login(name:String,pwd:String,responseResult: (String,Int)->Unit){
    if(name==USER_NAME_SAVE_DB3&&pwd==USER_PWD_SAVE_DB4){
        responseResult("登陆成功",200)
    }else{
        responseResult("登陆失败",404)
    }
}