package com.ronak.allsethome.ui.home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.ronak.allsethome.R
import com.ronak.allsethome.pojo.order_product_list
import java.io.Serializable

class ListDAdapter(val context: Context) : RecyclerView.Adapter<ListDAdapter.MyViewHolder>() {

    var movieList: List<order_product_list> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.grid_ui, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.card.setOnClickListener{
            //val intent = Intent(this, Settingts::class.java)
            //startActivity(intent)
        }

        /*Glide.with(context)
            .load(movieList.get(position).image)
            .apply(RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
            .into(holder.image_icon)*/
    }

    fun setMovieListItems(movieList: List<order_product_list>) {
        this.movieList = movieList;
        notifyDataSetChanged()
    }

    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {

        val card: CardView = itemView!!.findViewById(R.id.card)
        val image: ImageView = itemView!!.findViewById(R.id.image)
        val title: TextView = itemView!!.findViewById(R.id.title)

    }
}
