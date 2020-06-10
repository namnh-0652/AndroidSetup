package com.namnh.androidsetup.logic

class MainLogic {
    fun add(a: Int, b: Int) = a + b
    fun greet(name: String = "World"): String {
        return "Hello, $name!"
    }

    fun hasDuplicatedNumber(list: List<Int>, checkNum: Int): Boolean {
        val count = list.count { i -> i == checkNum }
        return count > 1
    }
}
