package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows a user to roll a dice and view the results on the screen.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton4: Button = findViewById(R.id.buttonD4)
        rollButton4.setOnClickListener { rollDice4() }
        val rollButton6: Button = findViewById(R.id.buttonD6)
        rollButton6.setOnClickListener { rollDice6() }
        val rollButton8: Button = findViewById(R.id.buttonD8)
        rollButton8.setOnClickListener { rollDice8() }
        val rollButton10: Button = findViewById(R.id.buttonD10)
        rollButton10.setOnClickListener { rollDice10() }
        val rollButton12: Button = findViewById(R.id.buttonD12)
        rollButton12.setOnClickListener { rollDice12() }
        val rollButton20: Button = findViewById(R.id.buttonD20)
        rollButton20.setOnClickListener { rollDice20() }
    }

    /**
     * Roll the 6-sided dice and update the screen with the result.
     */

    private fun rollDice4() {
        // create dice with 4 sides
        val dice = Dice(4)
        // Roll dice and save result
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageViewD4)
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.die4_1)
            2 -> diceImage.setImageResource(R.drawable.die4_2)
            3 -> diceImage.setImageResource(R.drawable.die4_3)
            4 -> diceImage.setImageResource(R.drawable.die4_4)
        }
    }

    private fun rollDice6() {
        // create dice with 6 sides
        val dice = Dice(6)
        // Roll dice and save result
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageViewD6)
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.die6_1)
            2 -> diceImage.setImageResource(R.drawable.die6_2)
            3 -> diceImage.setImageResource(R.drawable.die6_3)
            4 -> diceImage.setImageResource(R.drawable.die6_4)
            5 -> diceImage.setImageResource(R.drawable.die6_5)
            6 -> diceImage.setImageResource(R.drawable.die6_6)
        }
    }

    private fun rollDice8() {
        // create dice with 8 sides
        val dice = Dice(8)
        // Roll dice and save result
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageViewD8)
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.die8_1)
            2 -> diceImage.setImageResource(R.drawable.die8_2)
            3 -> diceImage.setImageResource(R.drawable.die8_3)
            4 -> diceImage.setImageResource(R.drawable.die8_4)
            5 -> diceImage.setImageResource(R.drawable.die8_5)
            6 -> diceImage.setImageResource(R.drawable.die8_6)
            7 -> diceImage.setImageResource(R.drawable.die8_7)
            8 -> diceImage.setImageResource(R.drawable.die8_8)
        }
    }

    private fun rollDice10() {
        // create dice with 10 sides
        val dice = Dice(10)
        // Roll dice and save result
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageViewD10)
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.die10_0)
            2 -> diceImage.setImageResource(R.drawable.die10_1)
            3 -> diceImage.setImageResource(R.drawable.die10_2)
            4 -> diceImage.setImageResource(R.drawable.die10_3)
            5 -> diceImage.setImageResource(R.drawable.die10_4)
            6 -> diceImage.setImageResource(R.drawable.die10_5)
            7 -> diceImage.setImageResource(R.drawable.die10_6)
            8 -> diceImage.setImageResource(R.drawable.die10_7)
            9 -> diceImage.setImageResource(R.drawable.die10_8)
            10 -> diceImage.setImageResource(R.drawable.die10_9)
        }
    }

    private fun rollDice12() {
        // create dice with 12 sides
        val dice = Dice(12)
        // Roll dice and save result
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageViewD12)
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.die12_1)
            2 -> diceImage.setImageResource(R.drawable.die12_2)
            3 -> diceImage.setImageResource(R.drawable.die12_3)
            4 -> diceImage.setImageResource(R.drawable.die12_4)
            5 -> diceImage.setImageResource(R.drawable.die12_5)
            6 -> diceImage.setImageResource(R.drawable.die12_6)
            7 -> diceImage.setImageResource(R.drawable.die12_7)
            8 -> diceImage.setImageResource(R.drawable.die12_8)
            9 -> diceImage.setImageResource(R.drawable.die12_9)
            10 -> diceImage.setImageResource(R.drawable.die12_10)
            11 -> diceImage.setImageResource(R.drawable.die12_11)
            12 -> diceImage.setImageResource(R.drawable.die12_12)
        }
    }

    private fun rollDice20() {
        // create dice with 20 sides
        val dice = Dice(20)
        // Roll dice and save result
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageViewD20)
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.die20_1)
            2 -> diceImage.setImageResource(R.drawable.die20_2)
            3 -> diceImage.setImageResource(R.drawable.die20_3)
            4 -> diceImage.setImageResource(R.drawable.die20_4)
            5 -> diceImage.setImageResource(R.drawable.die20_5)
            6 -> diceImage.setImageResource(R.drawable.die20_6)
            7 -> diceImage.setImageResource(R.drawable.die20_7)
            8 -> diceImage.setImageResource(R.drawable.die20_8)
            9 -> diceImage.setImageResource(R.drawable.die20_9)
            10 -> diceImage.setImageResource(R.drawable.die20_10)
            11 -> diceImage.setImageResource(R.drawable.die20_11)
            12 -> diceImage.setImageResource(R.drawable.die20_12)
            13 -> diceImage.setImageResource(R.drawable.die20_13)
            14 -> diceImage.setImageResource(R.drawable.die20_14)
            15 -> diceImage.setImageResource(R.drawable.die20_15)
            16 -> diceImage.setImageResource(R.drawable.die20_16)
            17 -> diceImage.setImageResource(R.drawable.die20_17)
            18 -> diceImage.setImageResource(R.drawable.die20_18)
            19 -> diceImage.setImageResource(R.drawable.die20_19)
            20 -> diceImage.setImageResource(R.drawable.die20_20)
        }
    }


class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}}
