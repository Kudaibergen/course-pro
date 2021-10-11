package com.kay.pro

open class Person (
    val name: String,
    val secondName: String,
    val age: Int
) {

    open fun print() {
        println("name: $name, " +
                "\nsecondName= $secondName " +
                "\nage= $age")
        println("---")
    }
}

class Employee(
    val nameEmp: String,
    val secondNameEmp: String,
    val ageEmp: Int,
    val company: String
): Person(nameEmp, secondNameEmp, ageEmp) {

    override fun print() {
        println("name: $name, " +
                "\nsecondName= $secondName " +
                "\nage= $age" +
                "\ncompany= $company")
        println("---")
    }

    fun print2() {
        //
    }
}