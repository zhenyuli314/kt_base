package com.lzy.s2;

import java.util.ArrayList;

interface ResponseResult {
    void run(String msg,int code);
}

public class Java版本的29 {
    public static void main(String[] args) {
        loginAPI("lzylzy", "123123", new ResponseResult() {
            public void run(String msg, int code) {
                System.out.printf("msg:%s,code:%d", msg,code);
            }
        });
    }

    public static final String USER_NAME_SAVE_DB = "lzylzy";
    public static final String USER_PWD_SAVE_DB = "123123";

    //登录API，模仿前端
    public static void loginAPI( String userName, String userPwd,ResponseResult responseResult ) {
        if (userName == null || userPwd == null) {
            throw new RuntimeException("用户名或密码为空");
        }
        //做很多的前端校验
        if (userName.length() > 3 && userPwd.length() > 3) {
            if (loginService(userName,userPwd)){
                //做很多其他工作
                //...
                responseResult.run("登录成功",200);
            }else{
                //做很多其他工作
                //...
                responseResult.run("登陆失败",444);
            }
        }else{
            throw new RuntimeException("格式不规范");
        }
    }

    //后端服务
    public static boolean loginService( String userName, String userPwd) {
        return userName.equals(USER_NAME_SAVE_DB) && userPwd.equals(USER_PWD_SAVE_DB);
    }
}
