package com.lannstark.lec09

fun main() {
    val person = Person()
    println(person.name)

    person.age = 11
    println(person.age)
}

class Person(
    name: String = "park",
    var age: Int = 1
) {
    var name = name
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
    }

    val upperCaseName: String
        get() = this.name.uppercase()

    val isAdult: Boolean
        get() = this.age >= 20
}