package com.libienz.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val right_dice = findViewById<ImageView>(R.id.right_dice)
        val left_dice = findViewById<ImageView>(R.id.left_dice)

        val roll_btn = findViewById<Button>(R.id.roll_btn)

        roll_btn.setOnClickListener {
            val range = (1..6)
            val right_num = range.random()
            val left_num = range.random()

            if (right_num == 1) {
                right_dice.setImageResource(R.drawable.dice_1)
                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
            }
            else if (right_num == 2) {
                right_dice.setImageResource(R.drawable.dice_2)
                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
            }
            else if (right_num == 3) {
                right_dice.setImageResource(R.drawable.dice_3)
                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
            }
            else if (right_num == 4) {
                right_dice.setImageResource(R.drawable.dice_4)
                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
            }
            else if (right_num == 5) {
                right_dice.setImageResource(R.drawable.dice_5)
                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
            }
            else {
                right_dice.setImageResource(R.drawable.dice_6)
                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
            }


            if (left_num == 1) {
                left_dice.setImageResource(R.drawable.dice_1)
                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
            }
            else if (left_num == 2) {
                left_dice.setImageResource(R.drawable.dice_2)
                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
            }
            else if (left_num == 3) {
                left_dice.setImageResource(R.drawable.dice_3)
                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
            }
            else if (left_num == 4) {
                left_dice.setImageResource(R.drawable.dice_4)
                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
            }
            else if (left_num == 5) {
                left_dice.setImageResource(R.drawable.dice_5)
                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
            }
            else {
                left_dice.setImageResource(R.drawable.dice_6)
                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
            }

        }
    }
}