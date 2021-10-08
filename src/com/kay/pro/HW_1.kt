package com.kay.pro

fun main() {
    println("Введите оператор: ")
    val x = readLine()!!
    when(x) {
        "+" -> {}
        "-" -> {}
        "*" -> {}
        "/" -> divide()
        else -> {
            println("Введите оператор!!")
        }
    }
}

private fun divide() {
    val a1 = readLine()!!.parseToInt()
    val a2 = readLine()!!.parseToInt()
    println(div(a1, a2))
}

private fun div(a1: Int, a2: Int): String {
    return try {
        "res= ${a1 / a2}"
    } catch (e: ArithmeticException) {
        "На 0 делить нельзя!!!"
    }
}

private fun String.parseToInt(): Int {
    if (this == "") return 0
    //---
    return this.toInt()
}