package com.lannstark.lec20

import com.lannstark.lec19.Person

fun main() {

}

fun printPerson(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}