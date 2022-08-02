package com.lzy.s6

/**
 * https://blog.csdn.net/u011215710/article/details/103906478
 * 类型擦除：https://www.weixueyuan.net/a/e0vq9r.html#:~:text=Java%20%E6%B3%9B%E5%9E%8B%E6%93%A6%E9%99%A4,%EF%BC%88%E7%B1%BB%E5%9E%8B%E6%93%A6%E9%99%A4%EF%BC%89%E6%98%AF%E6%8C%87%E5%9C%A8%E7%BC%96%E8%AF%91%E5%99%A8%E5%A4%84%E7%90%86%E5%B8%A6%E6%B3%9B%E5%9E%8B%E5%AE%9A%E4%B9%89%E7%9A%84%E7%B1%BB%E3%80%81%E6%8E%A5%E5%8F%A3%E6%88%96%E6%96%B9%E6%B3%95%E6%97%B6%EF%BC%8C%E4%BC%9A%E5%9C%A8%E5%AD%97%E8%8A%82%E7%A0%81%E6%8C%87%E4%BB%A4%E9%9B%86%E9%87%8C%E6%8A%B9%E5%8E%BB%E5%85%A8%E9%83%A8%E6%B3%9B%E5%9E%8B%E7%B1%BB%E5%9E%8B%E4%BF%A1%E6%81%AF%EF%BC%8C%E6%B3%9B%E5%9E%8B%E8%A2%AB%E6%93%A6%E9%99%A4%E5%90%8E%E5%9C%A8%E5%AD%97%E8%8A%82%E7%A0%81%E9%87%8C%E5%8F%AA%E4%BF%9D%E7%95%99%E6%B3%9B%E5%9E%8B%E7%9A%84%E5%8E%9F%E5%A7%8B%E7%B1%BB%E5%9E%8B%EF%BC%88raw%20type%EF%BC%89%E3%80%82%20%E7%B1%BB%E5%9E%8B%E6%93%A6%E9%99%A4%E7%9A%84%E5%85%B3%E9%94%AE%E5%9C%A8%E4%BA%8E%E4%BB%8E%E6%B3%9B%E5%9E%8B%E7%B1%BB%E5%9E%8B%E4%B8%AD%E6%B8%85%E9%99%A4%E7%B1%BB%E5%9E%8B%E5%8F%82%E6%95%B0%E7%9A%84%E7%9B%B8%E5%85%B3%E4%BF%A1%E6%81%AF%EF%BC%8C%E7%84%B6%E5%90%8E%E5%9C%A8%E5%BF%85%E8%A6%81%E7%9A%84%E6%97%B6%E5%80%99%E6%B7%BB%E5%8A%A0%E7%B1%BB%E5%9E%8B%E6%A3%80%E6%9F%A5%E5%92%8C%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2%E7%9A%84%E6%96%B9%E6%B3%95%E3%80%82
 * reified 和 inline结合使用解决 泛型擦除 的问题
 */


class KtBase113 {
    /**
     * 代码在转换类型时，没有进行检查，所以有可能会导致运行时崩溃，编译器会提示unchecked cast警告,
     * 如果获得的数据不是它期望的类型，这个函数会出现  崩溃
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




