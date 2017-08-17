package com.pattadon.androidtransitionanimation.secondprogram

import android.widget.ImageView

/**
 * Created by pattadon on 8/17/17.
 */
interface SecondProgramInterface {
    fun clickItem(position : Int ,mutableList: MutableList<String> , imageView : ImageView)
}