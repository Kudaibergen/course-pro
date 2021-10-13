package com.kay.pro

class A(val arg: Int) {

    var a1: String = ""
        get() {
            // --
            return "$field $arg"
        }
        private set(value) {
            // --
            field = "$value+xxx"
        }

    companion object {
        const val v = "xxx"
    }
}