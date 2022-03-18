package com.lzy.s6

import java.util.*

class KtBase107<T>(vararg objects: T,var isMap:Boolean){
    //1.out 我们的T只能被读取，不能修改 T只能读取
    private val objArr : Array<out T> = objects

    //2.如果不存在就返回null
    fun showObj(index:Int) : T? = objArr.getOrNull(index)

    //3.转换类型
    fun <O> mapObj(index:Int, mapAction: (T?) -> O) =
        mapAction(objArr[index].takeIf { isMap })
}

fun main() {
    //注意p的类型和obj的类型
    var p : KtBase107<Any?> = KtBase107("a", "b", false, 2, null, isMap = true)
    println(p.showObj(4))
    var obj : Any?= p.showObj(3)

}