package com.lzy.s5

/**
转换成Java代码为：
public final class KtBase87 {
    @NotNull
    private static final String name;
    @NotNull
    public static final KtBase87 INSTANCE;

    @NotNull
    public final String getName() {
        return name;
    }

    public final void show() {
        String var1 = "我是show函数";
        System.out.println(var1);
    }

    private KtBase87() {}  //私有化构造器

    //init代码块变成static代码块。初始化 INSTANCE
    static {
        KtBase87 var0 = new KtBase87();
        INSTANCE = var0;
        name = "zly";
        String var1 = "init+" + name;
        boolean var2 = false;
        System.out.println(var1);
        }
}
 */

//即单例模式
object KtBase87{
    val name = "zly"
    init {
        println("init+$name")
    }
    fun show(){
        println("我是show函数")
    }
}

fun main() {
    /**
     * 注意：KtBase87就是对象，不能加（），因为构造函数已经私有化
     */
    println(KtBase87)
    println(KtBase87)
    println(KtBase87)
    //KtBase87.INSTANCE.show()
    KtBase87.show()
}