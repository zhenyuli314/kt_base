package com.lzy.s6

/**
 * 扩展函数：
 */

data class KtBase114(val name:String,val age:Int, val sex:Char)

//对KtBase114增加扩展函数
fun KtBase114.showInfo() = println("我是${name}，年龄为${age}，性别$sex")

//对一些源码增加扩展函数，默认是public的，在其他类中都可以使用
fun String.showStr() = println(this)

fun main() {
    var p = KtBase114("lzy", 25, '男')
    p.showInfo()
    "ABC123".showStr()
}

//扩展函数背后的java代码
//public final class _114_扩展函数Kt {
//    public static final void showInfo(@NotNull KtBase113 $this$showInfo) {
//        Intrinsics.checkNotNullParameter($this$showInfo, "$this$showInfo");
//        String var1 = "我是" + $this$showInfo.getName() + "，年龄为" + $this$showInfo.getAge() + "，性别" + $this$showInfo.getSex();
//        boolean var2 = false;
//        System.out.println(var1);
//    }
//
//    public static final void showStr(@NotNull String $this$showStr) {
//        Intrinsics.checkNotNullParameter($this$showStr, "$this$showStr");
//        boolean var1 = false;
//        System.out.println($this$showStr);
//    }
//
//    public static final void main() {
//        KtBase113 p = new KtBase113("lzy", 25, '男');
//        showInfo(p);
//        showStr("ABC123");
//    }
//
//    // $FF: synthetic method
//    public static void main(String[] var0) {
//        main();
//    }
//}