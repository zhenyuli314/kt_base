package com.lzy.s1

// TODO: 2021/12/15 函数参数的默认参数(java不具备)
fun main() {
    action01("adsa",11)
    action02("lzlzlzl")
    action03()

}

private fun action01(name: String, age: Int) {
    println("$name,$age")
}

private fun action02(name: String, age: Int=77) {
    println("$name,$age")
}
private fun action03(name: String="abbbbbbbbbbbb", age: Int=77) {
    println("$name,$age")
}


