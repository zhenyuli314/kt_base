package com.lzy.s4


class KtBase78{
    lateinit var info :String

    fun load(){
        info = "赋值成功！"
    }

    fun show(){
        /**
         * 由于你还没有给它初始化，所以只要调用就会报错
         */
//        if (info==null) println()

        //::info.isInitialized方法引用（具名方法引用）
        if (::info.isInitialized){
            println(info)
        }else{
            println("你还没有加载")
        }
    }

}

fun main() {
    var base78 = KtBase78()
//    base78.load()
    base78.show()
}