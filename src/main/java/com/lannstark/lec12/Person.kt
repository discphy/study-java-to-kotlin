package com.lannstark.lec12

import com.lannstark.lec10.Flyable

fun main() {
   moveSomething(object : Movable {
       override fun move() {
           println("move")
       }

       override fun fly() {
           println("fly")
       }
   })
}

class Person private constructor (
    val name: String,
    val age: Int,
) {

    companion object Factory : Log {
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("LOG")
        }
    }
}

object Singleton {
    var a: Int = 0
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}
