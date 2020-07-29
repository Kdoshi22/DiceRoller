package com.example.diceroller
// androidx is namespace for android jetpack a library by google
// to support app on older android devices
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

// AppCompatActivity is a subclass of android that gives us access for the modern android features and also providing back compatibility to older android versions
class MainActivity : AppCompatActivity() {

    // lateinit keyword is a promise that we will not leave the variable null
    // By this now we are finding the two only once in our program
    lateinit var diceImage : ImageView
    lateinit var Info : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }
        diceImage = findViewById(R.id.dice_image)
        Info = findViewById(R.id.display_info)
    }
    private fun rollDice()
    {
        val randomInt = Random.nextInt(6) + 1
        val drawableResource = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        Info.text = " "
    }
}