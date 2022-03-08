package com.lzy.s1
// TODO: 2021/12/15 具名函数参数 (java不具备)
fun main() {
    loginAction(userName = "lzy",userPwd = "123")
}

private fun loginAction(userName:String,userPwd:String){
    println("${userName},${userPwd}")
}