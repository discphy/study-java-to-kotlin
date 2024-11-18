package com.lannstark.lec03

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        println(obj.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}
