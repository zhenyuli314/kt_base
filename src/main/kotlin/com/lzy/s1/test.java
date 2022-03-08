package com.lzy.s1;

import org.junit.jupiter.api.Test;

public class test {
    public static void main(String[] args) {
        System.out.println();
        int age;
        age = 4;
        switch (age) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 4:
                System.out.println("21");
                break;
            default:
                System.out.println("other");
        }

        method1("2131");
    }
    public static void method1(String userName){
        System.out.println(userName);
    }

    @Test
    public void test1(){

        String s = 1+"123";
        System.out.println(s);
    }
}
