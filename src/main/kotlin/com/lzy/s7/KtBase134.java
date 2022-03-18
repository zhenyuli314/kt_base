package com.lzy.s7;

public class KtBase134 {
    public static void main(String[] args) {
        //不加@JvmField 和 @JvmStatic
//        System.out.println(MyObject.Companion.getTARGET());
//        MyObject.Companion.showAction("lzy");

        //加@JvmField 和 @JvmStatic
        System.out.println(MyObject.TARGET);
        MyObject.showAction("lzy");
    }
}
