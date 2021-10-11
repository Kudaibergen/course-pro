package com.kay.pro

fun main() {
    val person = Person(
        name= "Sasha",
        secondName = "Petrov",
        age = 24
    )

    val employee: Employee = Employee(
        nameEmp= "SashaE",
        secondNameEmp = "PetrovE",
        ageEmp = 24,
        company = "XXXX"
    )

    val employee2: Person = Employee(
        nameEmp= "Sasha2",
        secondNameEmp = "Petrov2",
        ageEmp = 24,
        company = "XXXX2"
    )

    val pJava = PersonJava("SashaJava", "SS", 21)

    person.print()
    employee.print()
    employee2.print()

//    employee2.print2()
    employee.print2()

}