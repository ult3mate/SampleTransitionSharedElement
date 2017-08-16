package com.pattadon.androidtransitionanimation.secondprogram

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pattadon.androidtransitionanimation.R


/**
 * Created by pattadon on 8/16/17.
 */

class SecondProgramAdapter : RecyclerView.Adapter<SecondProgramAdapter.SecondViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder? {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.second_program_adapter, parent, false)

        return null
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 0
    }

    inner class SecondViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
