package com.lzy.s3;

import kotlin.text.StringsKt;
import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.Calendar;

public class a2 {
    public static void main(String[] args) throws InterruptedException {
        String name = "abc";
        String name2 = "Abc";
        String aCase = name2.toLowerCase();
        System.out.println(aCase);
        System.out.println(name==aCase);
        Thread.sleep(100000);
        String capitalize = StringsKt.capitalize("abc").intern();
        System.out.println(capitalize == name2);
    }
}
