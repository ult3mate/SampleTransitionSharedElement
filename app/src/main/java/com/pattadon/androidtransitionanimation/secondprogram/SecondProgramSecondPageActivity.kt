package com.pattadon.androidtransitionanimation.secondprogram

import android.os.Bundle
import android.support.v4.view.ViewCompat
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.pattadon.androidtransitionanimation.R
import kotlinx.android.synthetic.main.second_program_second_page_activity.*

/**
 * Created by pattadon on 8/16/17.
 */

class SecondProgramSecondPageActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_program_second_page_activity)


        ViewCompat.setTransitionName(second_program_activity_image_view_detail,"One")

        Glide.with(this)
                .load("https://7greens.tourismthailand.org/api/asset/reward/reward_1.jpg")
                .into(second_program_activity_image_view_detail)
    }
}
