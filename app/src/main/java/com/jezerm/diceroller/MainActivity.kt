package com.jezerm.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { this.rollDice() }
        this.rollDice()
    }

    /**
     * Roll the dice and update the textView with the result
     */
    private fun rollDice() {
        val diceImage: ImageView = findViewById(R.id.imageView)
        val dice = Dice(6)
        val diceRoll = dice.roll()

        val diceDrawable = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(diceDrawable)
        diceImage.contentDescription = "$diceRoll"
    }
}