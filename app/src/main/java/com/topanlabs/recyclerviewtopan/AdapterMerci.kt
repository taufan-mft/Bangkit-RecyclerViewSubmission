package com.topanlabs.recyclerviewtopan

import android.content.Context
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.like.LikeButton
import com.like.OnLikeListener
import com.makeramen.roundedimageview.RoundedImageView
import com.topanlabs.recyclerviewtopan.model.MercedesCar


class AdapterMerci(private val listMobil: ArrayList<MercedesCar>, var contextnya: Context) : RecyclerView.Adapter<AdapterMerci.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var likeButton: LikeButton = itemView.findViewById(R.id.star_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(
            R.layout.item_row_merci,
            parent,
            false
        )
        return ListViewHolder(view)
    }
class Ditekan(val contextnya: Context, val posisi: Int): OnLikeListener {
    override fun liked(p0: LikeButton?) {
        Toast.makeText(contextnya, "DITEKAN $posisi", Toast.LENGTH_SHORT).show()
    }

    override fun unLiked(p0: LikeButton?) {

    }

}
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val mobil = listMobil[position]
        holder.imgPhoto.setImageResource(mobil.photo)
        holder.tvName.text = mobil.name
        holder.tvDetail.text = mobil.tagline
        holder.likeButton.setOnLikeListener(Ditekan(contextnya, position))

    }

    override fun getItemCount(): Int {
        return listMobil.size
    }

}