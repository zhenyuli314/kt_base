package com.lzy.s3

fun main() {
    val result = checkPermission("root","abcde发、")
    println(result)
}

/**
 * takeIf 表达式中为true，则返回name本身。否则返回null 。 一般配合 空安全操作符使用 ?:
 */
fun checkPermission(name: String, pwd: String): String =
    name.takeIf { permissionSys(name, pwd) } ?: "权限不足！"

fun permissionSys(name: String, pwd: String): Boolean =
    name == "root" && pwd == "abcde"