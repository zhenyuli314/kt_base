package com.lzy.s6

/**
 * https://blog.csdn.net/u011215710/article/details/103906478
 * reified 和 inline结合使用解决 泛型擦除 的问题
 */


class KtBase113 {
    /**
     * 代码在转换类型时，没有进行检查，所以有可能会导致运行时崩溃，编译器会提示unchecked cast警告,
     * 如果获得的数据不是它期望的类型，这个函数会出现崩溃
     */
    fun <T> Int.toCase(): T? {
        return (this as T)
    }

    /**
     * 所以为了安全获取数据一般都是需要显式传递class信息：
     * 但这需要通过显示传递class的方式过于麻烦繁琐尤其是传递多类型参数，
     * 基于类型擦除机制无法在运行时得到T的类型信息，所以用到安全转换操作符as或者as?
     */
    fun <T> Int.toCase(clz: Class<T>): T? {
        return if (clz.isInstance(this)) {
            this as? T
        } else {
            null
        }
    }


    /**
     * 泛型在运行时会被类型擦除，但是在inline函数中我们可以指定类型不被擦除，
     * 因为inline函数在编译期会将字节码copy到调用它的方法里，
     * 所以编译器会知道当前的方法中泛型对应的具体类型是什么，然后把泛型替换为具体类型，
     * 从而达到不被擦除的目的，
     * 在inline函数中我们可以通过reified关键字来标记这个泛型在编译时替换成具体类型
     */
    inline fun <reified T> Int.toCase2(): T? {
        return if (this is T) {
            this
        } else {
            null
        }
    }
}




