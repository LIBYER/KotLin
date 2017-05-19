package com.by.kotlindemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.recylcer_item.view.*

/**
 * Created by leeby on 2017/5/19.
 */
class RecyclerViewAdapter(val context: Context, val list: List<String>) : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerHolder {

        return RecyclerHolder(LayoutInflater.from(context).inflate(R.layout.recylcer_item, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerHolder, position: Int) {
        val s = list.get(position)
        holder.itemView.item_text.text = s

    }

    class RecyclerHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    }

}