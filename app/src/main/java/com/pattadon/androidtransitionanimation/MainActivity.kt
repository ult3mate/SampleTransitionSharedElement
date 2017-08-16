package com.pattadon.androidtransitionanimation

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.pattadon.androidtransitionanimation.firstprogram.FirstProgramActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        first_program.setOnClickListener {
            openFirstProgram()
        }

        second_program.setOnClickListener {

        }

        third_program.setOnClickListener {

        }

        fourth_program.setOnClickListener {

        }
    }

    fun openFirstProgram(){
        val intent = Intent(this, FirstProgramActivity::class.java)
        startActivity(intent)
    }
}
