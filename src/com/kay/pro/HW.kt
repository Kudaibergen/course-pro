package com.kay.pro

/**
 * Домашнее задание, урок 2, 06.10.21
 * Четырехзначное число назовем счастливым,
 * если сумма первых двух ее цифр равна сумме двух последних.
 * Определить, счастливое ли заданное число, вернуть true, если это так.
 */

fun main() {
//    val num = readLine()!!.toCharArray()
//    num.forEach {
//        println("it= $it")
//    }
//    println("num[0]= ${num[0]}")
//    println("num[1]= ${num[1]}")
//    println("num[2]= ${num[2]}")
//    println("num[3]= ${num[3]}")

    val num = readLine()!!.toInt()
    val x4 = num % 10
    val x3 = num / 10 % 10
    println("num= $num, x4= $x4, x3= $x3")
}