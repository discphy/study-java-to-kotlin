package com.lannstark.lec08

fun main() {
    repeat("Hello", useNewLine = false)

    printNameAndGender(name = "Lann", gender = "M")

    printAll("Lann", "Park", "Lee")

    val array = arrayOf("Lann", "Park", "Lee")
    printAll(*array)
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
       if (useNewLine) {
           println(str)
       } else {
           print(str)
       }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}
