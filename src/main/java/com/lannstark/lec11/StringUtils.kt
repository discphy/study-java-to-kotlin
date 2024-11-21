package com.lannstark.lec11

fun isDirectoryPath(path: String): Boolean = path.endsWith("/")


class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set
}