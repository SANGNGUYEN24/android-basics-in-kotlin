package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


/**
 * @author sangnd
 * @since 05/07/2021
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference to roll button
        val rollButton: Button = findViewById(R.id.btRoll)
        // When click on roll button
        rollButton.setOnClickListener{
            rollDice()
        }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice(){
        // Random a number
        val randomNumber = (1..6).random()
        // reference to imageView
        val resultImage: ImageView = findViewById(R.id.imageView)

        val imageResource = when(randomNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> {
                Toast.makeText(this, "Lucky number!", Toast.LENGTH_LONG).show()
                R.drawable.dice_4
            }
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_1
        }

        // Update the image
        resultImage.setImageResource(imageResource)


    }
}