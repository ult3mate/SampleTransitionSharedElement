package com.pattadon.androidtransitionanimation.thirdprogram

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.pattadon.androidtransitionanimation.R

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        supportFragmentManager
                .beginTransaction()
                .add(R.id.content_frame, ThirdOneFragment.newInstance())
                .commit()

    }
}
