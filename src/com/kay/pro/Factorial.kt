package com.kay.pro

fun main() {
    val f = readLine()!!.toInt()
    println(factorial(f))
}

fun factorial(n: Int): Double = if (n < 2) 1.0 else n * factorial(n - 1)