package com.lzy.s5

/**
public final class KtBase89 {
private static final String info = "info";
public static final KtBase89.Companion Companion = new KtBase89.Companion((DefaultConstructorMarker)null);

public static final class Companion {
public final String getInfo() {
return KtBase89.info;
}

public final void show() {
String var1 = "show函数";
boolean var2 = false;
System.out.println(var1);
}

private Companion() {
}
}
}
 */
class KtBase89 {  //实际就是静态内部类，然后new一个对象给属性

    companion object {
        val info = "info"
        fun show() {
            println("show函数")
        }
    }
}

/**
 * 伴生对象的由来：在KT中是没有Java的static静态，伴生很大程度上和Java的这种static静态差不多的
 * 无论 KtBase89()构建对象多少次，我们的伴生对象，只有一次加载
 * 无论 KtBase89.show()调用多次，我们的伴生对象，只有一次加载
 * 伴生对象只会初始化一次
 */
fun main() {
    //背后代码：sout（KtBase89.Companion.getInfo()）
    println(KtBase89.info)

    //背后代码：KtBase89.show()
    KtBase89.show()

    //new KtBase89();
    KtBase89()
    KtBase89()
    KtBase89()
}