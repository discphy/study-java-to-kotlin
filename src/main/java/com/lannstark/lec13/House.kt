package com.lannstark.lec13


class House(
    private val address: String,
    private val livingRoom: LivingRoom,
) {
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String = this@House.address
    }
}