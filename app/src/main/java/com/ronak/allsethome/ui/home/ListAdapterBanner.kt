package com.ronak.allsethome.ui.home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ronak.allsethome.R
import com.ronak.allsethome.pojo.order_product_list
import java.io.Serializable

class ListAdapterBanner(val context: Context) : RecyclerView.Adapter<ListAdapterBanner.MyViewHolder>() {

    var movieList: List<order_product_list> = listOf()
    lateinit var recyclerAdapterBanner: ListAdapterBanner_two

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_bottom_ui, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.card.setOnClickListener{
            val intent = Intent(context, Detail_screen::class.java)
            context.startActivity(intent)
        }

        holder.title.text = "Best Deal"
        /*Glide.with(context)
            .load(movieList.get(position).image)
            .apply(RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
            .into(holder.image_icon)*/

        recyclerAdapterBanner = ListAdapterBanner_two(context)
        holder.recyclerViewBanner.layoutManager =  GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
        holder.recyclerViewBanner.adapter = recyclerAdapterBanner
    }

    fun setMovieListItems(movieList: List<order_product_list>) {
        this.movieList = movieList;
        notifyDataSetChanged()
    }

    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {

        val card: LinearLayout = itemView!!.findViewById(R.id.card)
        val title: TextView = itemView!!.findViewById(R.id.title)
        val recyclerViewBanner: RecyclerView = itemView!!.findViewById(R.id.id_Recycleview)

    }
}
