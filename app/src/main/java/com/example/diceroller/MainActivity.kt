package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows a user to roll a dice and view the results on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton20: Button = findViewById(R.id.buttonD20)
        rollButton20.setOnClickListener { rollDice20() }
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
    }

    /**
     * Roll the 20-sided dice and update the screen with the result.
     */
    private fun rollDice20() {
        // create dice with 20 sides
        val dice = Dice(20)
        // Roll dice and save result
        val diceRoll = dice.roll()
        // Find TextView by calling findViewByID()
        val resultTextView: TextView = findViewById(R.id.textView20)
        // Convert diceRoll from Int to Text
        resultTextView.text = diceRoll.toString()
    }

    private fun rollDice4() {
        // create dice with 4 sides
        val dice = Dice(4)
        // Roll dice and save result
        val diceRoll = dice.roll()
        // Find TextView by calling findViewByID()
        val resultTextView: TextView = findViewById(R.id.textView4)
        // Convert diceRoll from Int to Text
        resultTextView.text = diceRoll.toString()
    }

    private fun rollDice6() {
        // create dice with 6 sides
        val dice = Dice(6)
        // Roll dice and save result
        val diceRoll = dice.roll()
        // Find TextView by calling findViewByID()
        val resultTextView: TextView = findViewById(R.id.textView6)
        // Convert diceRoll from Int to Text
        resultTextView.text = diceRoll.toString()
    }

    private fun rollDice8() {
        // create dice with 8 sides
        val dice = Dice(8)
        // Roll dice and save result
        val diceRoll = dice.roll()
        // Find TextView by calling findViewByID()
        val resultTextView: TextView = findViewById(R.id.textView8)
        // Convert diceRoll from Int to Text
        resultTextView.text = diceRoll.toString()
}

    private fun rollDice10() {
        // create dice with 10 sides
        val dice = Dice(10)
        // Roll dice and save result
        val diceRoll = dice.roll()
        // Find TextView by calling findViewByID()
        val resultTextView: TextView = findViewById(R.id.textView10)
        // Convert diceRoll from Int to Text
        resultTextView.text = diceRoll.toString()
    }

    private fun rollDice12() {
        // create dice with 12 sides
        val dice = Dice(12)
        // Roll dice and save result
        val diceRoll = dice.roll()
        // Find TextView by calling findViewByID()
        val resultTextView: TextView = findViewById(R.id.textView12)
        // Convert diceRoll from Int to Text
        resultTextView.text = diceRoll.toString()
    }

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}}
