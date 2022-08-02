package com.lzy.s6

/**
 * 扩展属性
 */
val s: String = "abc"
val String.name: String
    get() = "lzy"
/**
 * 背后源码
 *
 *
public final class _118_扩展属性Kt {
@NotNull
private static final String s = "abc";

@NotNull
public static final String getS() {
return s;
}

@NotNull
public static final String getName(@NotNull String $this$name) {
Intrinsics.checkNotNullParameter($this$name, "$this$name");
return "lzy";
}
}
 */
fun main() {
    println(s)
    println("abc".name)
}