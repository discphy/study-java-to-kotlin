package com.lannstark.lec19

data class Person (
    val name: String,
    val age: Int
) {
    /*operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this. age
    }*/
}

fun main() {
    val person = Person("park", 10)
    val (name, age) = person

    println("이름 : $name, 나이 : $age")

    val numbers = listOf(1, 2, 3)
    numbers.map { it * 2 }
        .forEach { println(it) }
}