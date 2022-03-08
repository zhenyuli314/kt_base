package com.lzy.s2

fun main() {
    //第三种：函数参数在最后一个时，可写在（）的外面
    loginAPI("lzylzy","123123") { msg: String, code: Int ->
        println("msg:$msg,code:$code")
    }
}

const val USER_NAME_SAVE_DB = "lzylzy"
const val USER_PWD_SAVE_DB = "123123"

//登录API，模仿前端
fun loginAPI(userName: String, userPwd: String, responseResult: (String, Int) -> Unit) {
    if (userName == null || userPwd == null) {
        TODO("用户名或密码为空")
    }
    //做很多的前端校验
    if (userName.length > 3 && userPwd.length > 3) {
        if (loginService(userName,userPwd)){
            //做很多其他工作
                //...
            responseResult("登录成功",200)
        }else{
            //做很多其他工作
                //...
            responseResult("登陆失败",444)
        }
    }else{
        TODO("格式不规范")
    }
}

//后端服务
fun loginService(userName: String, userPwd: String): Boolean {
    return userName == USER_NAME_SAVE_DB && userPwd == USER_PWD_SAVE_DB
}