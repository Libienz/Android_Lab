package com.libienz.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.libienz.dice.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.rollBtn.setOnClickListener {
            val range = (1..6)
            val right_num = range.random()
            val left_num = range.random()

            if (right_num == 1) {
                binding.rightDice.setImageResource(R.drawable.dice_1)
                Toast.makeText(this, "ROLL!", Toast.LENGTH_LONG).show()
            } else if (right_num == 2) {
                binding.rightDice.setImageResource(R.drawable.dice_2)
                Toast.makeText(this, "ROLL!", Toast.LENGTH_LONG).show()
            } else if (right_num == 3) {
                binding.rightDice.setImageResource(R.drawable.dice_3)
                Toast.makeText(this, "ROLL!", Toast.LENGTH_LONG).show()
            } else if (right_num == 4) {
                binding.rightDice.setImageResource(R.drawable.dice_4)
                Toast.makeText(this, "ROLL!", Toast.LENGTH_LONG).show()
            } else if (right_num == 5) {
                binding.rightDice.setImageResource(R.drawable.dice_5)
                Toast.makeText(this, "ROLL!", Toast.LENGTH_LONG).show()
            } else {
                binding.rightDice.setImageResource(R.drawable.dice_6)
                Toast.makeText(this, "ROLL!", Toast.LENGTH_LONG).show()
            }


            if (left_num == 1) {
                binding.leftDice.setImageResource(R.drawable.dice_1)
                Toast.makeText(this, "ROLL!", Toast.LENGTH_LONG).show()
            } else if (left_num == 2) {
                binding.leftDice.setImageResource(R.drawable.dice_2)
                Toast.makeText(this, "ROLL!", Toast.LENGTH_LONG).show()
            } else if (left_num == 3) {
                binding.leftDice.setImageResource(R.drawable.dice_3)
                Toast.makeText(this, "ROLL!", Toast.LENGTH_LONG).show()
            } else if (left_num == 4) {
                binding.leftDice.setImageResource(R.drawable.dice_4)
                Toast.makeText(this, "ROLL!", Toast.LENGTH_LONG).show()
            } else if (left_num == 5) {
                binding.leftDice.setImageResource(R.drawable.dice_5)
                Toast.makeText(this, "ROLL!", Toast.LENGTH_LONG).show()
            } else {
                binding.leftDice.setImageResource(R.drawable.dice_6)
                Toast.makeText(this, "ROLL!", Toast.LENGTH_LONG).show()
            }
        }
    }
}



//        roll_btn.setOnClickListener {
//            val range = (1..6)
//            val right_num = range.random()
//            val left_num = range.random()
//
//            if (right_num == 1) {
//                right_dice.setImageResource(R.drawable.dice_1)
//                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
//            }
//            else if (right_num == 2) {
//                right_dice.setImageResource(R.drawable.dice_2)
//                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
//            }
//            else if (right_num == 3) {
//                right_dice.setImageResource(R.drawable.dice_3)
//                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
//            }
//            else if (right_num == 4) {
//                right_dice.setImageResource(R.drawable.dice_4)
//                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
//            }
//            else if (right_num == 5) {
//                right_dice.setImageResource(R.drawable.dice_5)
//                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
//            }
//            else {
//                right_dice.setImageResource(R.drawable.dice_6)
//                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
//            }
//
//
//            if (left_num == 1) {
//                left_dice.setImageResource(R.drawable.dice_1)
//                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
//            }
//            else if (left_num == 2) {
//                left_dice.setImageResource(R.drawable.dice_2)
//                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
//            }
//            else if (left_num == 3) {
//                left_dice.setImageResource(R.drawable.dice_3)
//                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
//            }
//            else if (left_num == 4) {
//                left_dice.setImageResource(R.drawable.dice_4)
//                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
//            }
//            else if (left_num == 5) {
//                left_dice.setImageResource(R.drawable.dice_5)
//                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
//            }
//            else {
//                left_dice.setImageResource(R.drawable.dice_6)
//                Toast.makeText(this,"ROLL!",Toast.LENGTH_LONG).show()
//            }

