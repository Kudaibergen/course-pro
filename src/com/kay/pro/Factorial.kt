package com.kay.pro

fun main() {
    val f = readLine()!!.toInt()
    println(factorial(f))
}

fun factorial(n: Int): Double = if (n < 2) 1.0 else n * factorial(n - 1)

/**
 * n * factorial(n - 1)
 * n = 4
 * 4 * f(4-1) -> 24
 * n = 3
 * 3 * f(3-1) -> 6
 * n = 2
 * 2 * f(2-1) -> 2
 * n = 1
 */