package com.lannstark.lec14

fun main() {
    val dto1 = PersonDto("park", 10)
    val dto2 = PersonDto("park", 10)
    println(dto1 == dto2)
}

data class PersonDto(
    val name: String,
    val age: Int,
)