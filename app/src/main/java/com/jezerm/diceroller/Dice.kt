package com.jezerm.diceroller

class Dice(var numSides: Int) {
    fun roll(): Int {
        return (1..this.numSides).random()
    }
}