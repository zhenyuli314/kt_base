package com.lzy.s7;

public class KtBase132 {
    public static void main(String[] args) {
        Person person = new Person();

//        System.out.println(person.getNames());        //不加@JvmField，则只能调用该get方法

        System.out.println(person.names);//        加@JvmField，可以直接调用属性

    }
}
