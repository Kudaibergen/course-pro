package com.kay.pro

fun main() {
    println("Введите число: ")
    val a1 = readLine().parseToInt()

    println("Введите число: ")
    val a2 = readLine().parseToInt()

    println("Введите операцию: ")
    val xc = readLine()

    val sum = a1 + a2
    println("Сумма: $sum")

    val x = "v"
    when(x) {
        "z" -> println()
        "c" -> println()
        "b" -> println()
        "v" -> println()
        else -> {
            println()
        }
    }
}

private fun String?.parseToInt(): Int {
    if (this == null) return 0
    if (this == "") return 0

    return try {
        this.toInt()
    } catch (e: NumberFormatException) {
        println("exception= $e")
        0
    } catch (e: Exception) {
        println("exception= $e")
        0
    }
}