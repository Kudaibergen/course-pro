package com.kay.pro

lateinit var xx: String

fun main() {
    val x = 5
    val i1 = 5
    val i2: Int = 5
    val l1: Long = 10L
    val f1: Float = 10.0f
    val d1: Double = 10.0
    var n1: Nothing? = null

    val ss1 = "xxx"
    val ss2 = "xxx"

//    println("ss1 == ss2 -> ${ss1 == ss2}")
//
//    println(i1 == i2)

    // Преобразование
    val b: Byte = 3
    val i: Int = b.toInt()

    // nullable типы
    var i3: Int? = 5
    i3 = null
    var i4: Int = 5
//    i4 = null //ошибка

    val s1: String? = null
    val res = s1?.length ?: "variable is null"
    println("s1.length= $res")
}