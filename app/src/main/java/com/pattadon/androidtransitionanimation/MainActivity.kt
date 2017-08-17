package com.pattadon.androidtransitionanimation

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.pattadon.androidtransitionanimation.firstprogram.FirstProgramActivity
import com.pattadon.androidtransitionanimation.secondprogram.SecondProgramActivity
import com.pattadon.androidtransitionanimation.thirdprogram.ThirdActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        first_program.setOnClickListener {
            openFirstProgram()
        }

        second_program.setOnClickListener {
            openSecondProgram()
        }

        third_program.setOnClickListener {
            openThirdProgram()
        }

        fourth_program.setOnClickListener {

        }
    }

    /**
    Activity to Activity
     */
    fun openFirstProgram(){
        val intent = Intent(this, FirstProgramActivity::class.java)
        startActivity(intent)
    }

    /**
    Recyclerview to Activity
     */
    fun openSecondProgram(){
        val intent = Intent(this, SecondProgramActivity::class.java)
        startActivity(intent)
    }

    fun openThirdProgram(){
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }
}
