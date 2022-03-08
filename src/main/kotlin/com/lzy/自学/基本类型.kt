package com.lzy.自学

import org.junit.jupiter.api.Test

class ToolTest {
    @Test
    fun `表示方式`() {
        /**
         * IntegerCache类中有一个数组缓存了值从-128到127的Integer对象
         */
        val a: Int = 127
        val A: Int = a
        println(A)
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a

        val b: Int = 128
        val boxedB: Int? = b
        val anotherBoxedB: Int? = b

        println(boxedA === anotherBoxedA) // true
        /**
         * 注意数字装箱不一定保留同一性:
         */
        println(boxedB === anotherBoxedB) // false

    }

    @Test
    fun `表示方式（相等性）`() {
        val a: Int = 128
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        /**
         *
         * 另一方面，它保留了相等性:
         *
         * 注意：
         * ===:比较的是两个对象的地址是否相等
         * ==:比较的是数值是否相等
         */
        println(boxedA == anotherBoxedA) // 输出“true”
    }

    @Test
    fun `整数除法`() {
        val x = 5 / 2
        //println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
        println(x)

        val y = 5 / 2.toDouble()
        println(y)

    }

    @Test
    fun `数组`() {
        var arr = arrayOf(1, 2, 3)
        println(arr[0])
        arr[0] = 100
        println(arr[0])

        var arrayOfNulls = arrayOfNulls<String>(2)
        println(arrayOfNulls[0])

        val asc = Array(5) { i -> (i * i).toString() }
        asc.forEach { print(it) }

        println("Kotlin 中数组是不型变的（invariant）。这意味着 Kotlin 不让我们把 Array<String> 赋值给 Array<Any>，以防止可能的运行时失败（但是你可以使用 Array<out Any>, 参见类型投影）。")

        val ints: Array<Int> = arrayOf(1, 2, 3)
        val any = Array<Any>(3) { "" }
        copy(ints, any)
        any.forEach { println(it) }
    }

    fun copy(from: Array<out Any>, to: Array<Any>) {
        assert(from.size == to.size)
        for (i in from.indices)
            to[i] = from[i]
    }

    @Test
    fun `原生类型数组`() {
        val x: IntArray = intArrayOf(1, 2, 3)
        x[0] = x[1] + x[2]

        // 大小为 5、值为 [0, 0, 0, 0, 0] 的整型数组
        val arr1 = IntArray(5)

        // 例如：用常量初始化数组中的值
        // 大小为 5、值为 [42, 42, 42, 42, 42] 的整型数组
        val arr2 = IntArray(5) { 42 }

        // 例如：使用 lambda 表达式初始化数组中的值
        // 大小为 5、值为 [0, 1, 2, 3, 4] 的整型数组（值初始化为其索引值）
        var arr3 = IntArray(5) { it }
        arr3.forEach { println(it) }
    }

    @Test
    fun `字符串`(){
        //请注意，在⼤多数情况下，优先使⽤字符串模板或原始字符串⽽不是字符串连接 +号 。

        val s = "Hello, world!\n"

        val text = """
            for (c in "foo")
                print(c)
                     """

        //默认 | 用作边界前缀，但你可以选择其他字符并作为参数传入，比如 trimMargin(">")。
        val text2 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()

        println(s)
        println(text)
        println(text2)


    }

    @Test
    fun `转换操作符`(){
        val y = 123
        //不安全转换使⽤中缀操作符 as
        val x1: String = y as String
        //在类型转换的右侧使⽤可空类型
        val x2:String? = y as String?
        //安全转换操作符 as? ，它可以在失败时返回 null 请注意，尽管事实上 as? 的右边是⼀个⾮空类型的 String ，但是其转换的结果是可
        //空的。
        val x3:String? = y as? String
    }

}