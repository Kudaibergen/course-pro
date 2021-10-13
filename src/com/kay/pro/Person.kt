package com.kay.pro

class Person(name: String, sName: String) {
    lateinit var x: String

    constructor(name: String, sName: String, age: Int) : this(name,sName) {
        println("secondary constructor")
    }

    constructor(name: String) : this(name, "", 21) {
        println("third constructor")
    }

    init {
        println("init")
    }

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (this === other) return true
        if (other !is Person) return false

//        if (this.name != other.name) return false
        //
        return true
    }
}

data class DataPerson(val name: String)