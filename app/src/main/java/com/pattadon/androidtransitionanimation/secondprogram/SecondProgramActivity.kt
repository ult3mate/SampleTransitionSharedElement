package com.pattadon.androidtransitionanimation.secondprogram

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.view.ViewCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.ImageView
import com.pattadon.androidtransitionanimation.R
import kotlinx.android.synthetic.main.second_program_activity.*

class SecondProgramActivity : AppCompatActivity() , SecondProgramInterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_program_activity)

        supportActionBar?.title = "Recyclerview open new Act"

        initRecyclerviewManager()
        setAdapter()
    }

    fun initRecyclerviewManager(){
        val linearLayoutManager = LinearLayoutManager(this)
        second_program_recyclerview.layoutManager = linearLayoutManager
    }

    fun setAdapter(){
        val secondProgramAdapter = SecondProgramAdapter(this,this)
        second_program_recyclerview.adapter = secondProgramAdapter
    }

    override fun clickItem(position: Int , mutableList: MutableList<String> , imageView : ImageView) {
        val intent = Intent(this, SecondProgramSecondPageActivity::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this , imageView, ViewCompat.getTransitionName(imageView))
        startActivity(intent, options.toBundle())
    }
}
