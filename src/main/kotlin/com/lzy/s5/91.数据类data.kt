package com.lzy.s5
//普通类:set get 构造函数
class ResponseResultBean1(var msg: String, var code: Int, var data: String)
//数据类（相当于Java的entity类）:set get 构造函数 解构操作 copy toString hashCode equals
data class ResponseResultBean2(var msg: String, var code: Int, var data: String)

/**
 * 查看反编译java代码
 */
fun main() {
    //重写了toString
    println(ResponseResultBean1("loginSuccess",200,"登录成功的数据..."))
    println(ResponseResultBean2("loginSuccess",200,"登录成功的数据..."))

    println()

    //重写了equals
    println(
        ResponseResultBean1("loginSuccess",200,"登录成功的数据...")==
                ResponseResultBean1("loginSuccess",200,"登录成功的数据...")
    )
    println(
        ResponseResultBean2("loginSuccess",200,"登录成功的数据...")==
                ResponseResultBean2("loginSuccess",200,"登录成功的数据...")
    )
}

