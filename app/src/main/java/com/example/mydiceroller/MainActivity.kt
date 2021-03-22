package com.example.mydiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //var diceImage : ImageView? = null
    lateinit var diceImage : ImageView
    //lateinit var diceImage2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
       // diceImage2 = findViewById(R.id.dice_image2)
       /* val countButton: Button = findViewById(R.id.countup_button)
        countButton.setOnClickListener { countUp() }*/
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }

    }

    private fun rollDice() {
        diceImage.setImageResource(getRandomDiceImage())
        //diceImage2.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

       /* Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()*/
        //val resultText: TextView = findViewById(R.id.result_text)
        //resultText.text = "Dice Rolled!"
        //resultText.text = randomInt.toString()

    /*private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        // If text is the default "Hello World!" set that text to 1.
        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }*/
    private fun reset() {
        diceImage.setImageResource(R.drawable.empty_dice)
    }
}