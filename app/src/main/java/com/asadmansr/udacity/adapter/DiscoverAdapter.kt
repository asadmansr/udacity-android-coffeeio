package com.asadmansr.udacity.adapter

import Extra
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asadmansr.udacity.R
import com.asadmansr.udacity.model.Discovery
import com.asadmansr.udacity.ui.RestaurantActivity
import kotlinx.android.synthetic.main.list_discover.view.*


class DiscoverAdapter(private val context: Context, private val list: ArrayList<Discovery>) :
    RecyclerView.Adapter<ViewHolder>() {

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.list_discover,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ivDiscover.setImageResource(list[position].imgRes)
        holder.tvDiscoverTitle.text = list[position].title
        holder.tvDiscoverSubtitle.text = list[position].subtitle
        holder.llDiscover.setOnClickListener {
            val extras = Bundle()
            extras.putString(Extra.EXTRA_RESTAURANT_NAME, list[position].title)
            extras.putInt(Extra.EXTRA_RESTAURANT_IMAGE, list[position].imgRes)
            extras.putString(Extra.EXTRA_RESTAURANT_DESCRIPTION, list[position].description)
            extras.putString(Extra.EXTRA_RESTAURANT_ADDRESS, list[position].address)
            extras.putString(Extra.EXTRA_RESTAURANT_HOURS, list[position].hours)

            val intent = Intent(context, RestaurantActivity::class.java)
            intent.putExtras(extras)
            context.startActivity(intent)
        }
    }
}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val llDiscover = view.ll_discover!!
    val ivDiscover = view.iv_discover_card!!
    val tvDiscoverTitle = view.tv_discover_card_title!!
    val tvDiscoverSubtitle = view.tv_discover_card_subtitle!!
}