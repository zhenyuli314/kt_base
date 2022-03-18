package com.lzy.s6

/**、
 * https://blog.csdn.net/yanbober/article/details/109403924
 * 类似于java的 ？extends
 * java 中Collection<String>是Collection<? extends Object>的子类型，
 * 但不是Collection<Object>的子类型。? extends用来限定类型的上界，也就是常说的协变。
 * 我们只能把它当作 extends 后面的 E 类型来读取，且读取是安全的类型转换，但是不能写入，
 * 写入会导致编译错误，因为写入可能是不安全的类型转换。反之，? super用来限定类型的下界，
 * 也就是常说的逆变，逆变是用来保证写入安全的，但是不能读取，有可能类型是不安全的转换。
 */

