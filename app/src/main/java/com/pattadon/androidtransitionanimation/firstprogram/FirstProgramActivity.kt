package com.pattadon.androidtransitionanimation.firstprogram

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.util.Pair
import android.support.v4.view.ViewCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.pattadon.androidtransitionanimation.R
import kotlinx.android.synthetic.main.first_program_activity.*

/**
 * Created by pattadon on 8/16/17.
 *
 * Activity A captures shared element start values and pass them to Activity B via an Intent
    Activity B starts completely transparent
    Activity B reads the bundled values and prepares the scene
    Activity B runs the shared element animation
 */
class FirstProgramActivity : AppCompatActivity() {

    val pair : Pair<View, String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_program_activity)

        first_program_imageview.setOnClickListener {
            val intent = Intent(this, FirstProgramSecondPageActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                    first_program_imageview,
                    ViewCompat.getTransitionName(first_program_imageview))
            startActivity(intent, options.toBundle())
        }

        first_program_2_imageview.setOnClickListener {
            val intent = Intent(this, FirstProgramSecondPage2Activity::class.java)

            val p1 = Pair.create(first_program_imageview as View, "transition_first_program")
            val p2 = Pair.create(first_program_2_imageview as View, "transition_first_2_program")

            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this , p1, p2)
            startActivity(intent, options.toBundle())
        }
    }
}