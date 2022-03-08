package com.lzy.s4

/**
 1.计算属性：
    val 对应的java属性是final的，不可set
    如果没有显式赋值，则对应的java没有属性，只有get方法
 2.防范竞态条件
 */
class Abcd{
    /**
     * @NotNull
    private final String name = "lzy";

    @NotNull
    public final String getName() {
        return this.name;
    }
     */
    val name = "lzy" //注意java属性是final常量，所以不能set


    /**
     * @NotNull
    public final String getInfo() {
        return "123";
    }
     */
    val info //java只有一个get方法，因此没有field属性
        get() = "123"


    /**
     * 2.防范竞态条件
     */
    var country:String? = null //"" // null
    fun getShowCountry():String{
        return country?.let {
            if (it.isBlank()){
                "info是 “” "
            }else{
                "最终的结果是:$it"
            }
        }?:"是null"
    }
}

fun main() {
    println(Abcd().getShowCountry())
}