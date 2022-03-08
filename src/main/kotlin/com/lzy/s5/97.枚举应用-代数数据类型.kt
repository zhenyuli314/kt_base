package com.lzy.s5

enum class Score{
    不及格,
    及格,
    良,
    优;
}

fun main() {
    val sc = Score.及格
    val result = when(sc){
        Score.不及格 -> "成绩很差"
        Score.及格 -> "成绩有点差"
        Score.良 -> "成绩还行"
        Score.优 -> "成绩很好"
    }
    println(result)
}

//新的需求：得到优的人名。 下一节