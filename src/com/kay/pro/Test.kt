package com.kay.pro

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val arr = arrayOf(1, 2, 3, 4)
    val arr2 = arrayOf(1, 2, 3, 4, "", "", 2.0)

    arr[1] = 3
    arr[2] = 1
    val x2 = ""
    val x3 = ""
    val x = arr[1] // -> 2
    //ArrayList
    //LinkedList
//    val al = ArrayList<Int>(10_000)
//    al[10] = 10
//    val ll = LinkedList<String>()
//    ll[0] = "0"
//    ll[1] = "1"
//    ll[0] = "2"

    val list2 = listOf<Int>(1, 2, 3, 4)
//    list2.set(0, 20)
//    list2[0] = 20

    val mList = list2.toMutableList()
    mList.set(0, 10)
    mList[1] = 11
    mList.add(4, 23)

    mList.forEach {
        println("e= $it")
    }

//    val map = mapOf<String, String>("")
//
//    arr.forEach { println(it) }

    for (i in 0..9) {
        println("e= $i")
    }

    while(false) {
        // do
    }

    do {
        // do
    } while (false)


}