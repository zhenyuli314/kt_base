package com.lzy.s7

class Person{
    @JvmField
    val names = listOf("a","b","c")
}
/**
 *
不加    @JvmField
public final class Person {
    @NotNull
    private final List names = CollectionsKt.listOf(new String[]{"a", "b", "c"});

    @NotNull
    public final List getNames() {
        return this.names;
    }
}

加   @JvmField
public final class Person {
    @JvmField
    @NotNull
    public final List names = CollectionsKt.listOf(new String[]{"a", "b", "c"});
}
 */