package com.lzy.s2

/**
 * 在JVM上，定义的lambda会以实例化对象存在，虚拟机会为此分配内存，为了解决这种额外的内存开销，kotlin有一种优化机制叫"内联"，
 * 内联实际上就是在编译时会把代码复制一份替换lambda
 *
 * 如果函数参数有lambda，尽量使用inline
 */
fun main() {
    //第三种：函数参数在最后一个时，可写在（）的外面
    loginAPI2("lzylzy","123123") { msg: String, code: Int ->
        println("msg:$msg,code:$code")
    }
}

const val USER_NAME_SAVE_DB2 = "lzylzy"
const val USER_PWD_SAVE_DB2 = "123123"

//登录API，模仿前端
inline fun loginAPI2(userName: String, userPwd: String, responseResult: (String, Int) -> Unit) {
    if (userName == null || userPwd == null) {
        TODO("用户名或密码为空")
    }
    //做很多的前端校验
    if (userName.length > 3 && userPwd.length > 3) {
        if (loginService2(userName,userPwd)){
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
fun loginService2(userName: String, userPwd: String): Boolean {
    return userName == USER_NAME_SAVE_DB2 && userPwd == USER_PWD_SAVE_DB2
}