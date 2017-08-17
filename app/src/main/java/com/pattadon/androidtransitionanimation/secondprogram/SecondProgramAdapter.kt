package com.pattadon.androidtransitionanimation.secondprogram

import android.content.Context
import android.support.v4.view.ViewCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.pattadon.androidtransitionanimation.R
import kotlinx.android.synthetic.main.second_program_adapter.view.*
import java.util.*


/**
 * Created by pattadon on 8/16/17.
 */

class SecondProgramAdapter(context : Context, callback : SecondProgramInterface) : RecyclerView.Adapter<SecondProgramAdapter.SecondViewHolder>() {

    var callback : SecondProgramInterface? = null
    var context : Context? = null

    val itemMutableList : MutableList<String> = ArrayList()

    init {
        this.callback = callback
        this.context = context
        itemMutableList.add("One")
        itemMutableList.add("Two")
        itemMutableList.add("Three")
        itemMutableList.add("Four")
        itemMutableList.add("Five")
        itemMutableList.add("Six")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder? {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.second_program_adapter, parent, false)
        return SecondViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.itemView.second_adappter_tv.text = itemMutableList[position]

        ViewCompat.setTransitionName(holder.itemView.second_adappter_iv , itemMutableList[position])

        Glide.with(context).load("https://7greens.tourismthailand.org/api/asset/reward/reward_1.jpg").into(holder.itemView.second_adappter_iv)

        holder.itemView.setOnClickListener {
            callback?.clickItem(holder.adapterPosition ,itemMutableList, holder.itemView.second_adappter_iv)
        }
    }

    override fun getItemCount(): Int {
        return itemMutableList.size
    }

    inner class SecondViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
