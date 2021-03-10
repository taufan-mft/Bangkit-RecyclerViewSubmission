package com.topanlabs.recyclerviewtopan.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.like.LikeButton
import com.topanlabs.recyclerviewtopan.R
import java.text.DecimalFormat

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        var imgView: ImageView = findViewById(R.id.imageView)
        var tvName: TextView = findViewById(R.id.tvName)
        var tvHarga: TextView = findViewById(R.id.tvPrice)
        var tvTagline: TextView = findViewById(R.id.tvTagline)
        var tvAccel: TextView = findViewById(R.id.tvAccel)
        var tvEngine: TextView = findViewById(R.id.tvEngine)
        var tvTorque: TextView = findViewById(R.id.tvTorque)
        var likebtn: LikeButton = findViewById(R.id.star_button)
        val actionbar = supportActionBar
        actionbar!!.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayShowHomeEnabled(true)
        val dec = DecimalFormat("#,###.##")
        val mobil: MercedesCar = intent.getSerializableExtra("mobil") as MercedesCar
        imgView.setImageResource(mobil.photo)
        tvName.text = mobil.name
        actionbar.title = mobil.name
        tvHarga.text = "$${dec.format(mobil.harga)}"
        tvTagline.text = mobil.tagline
        tvAccel.text = "${mobil.acceleration}s"
        tvTorque.text = "${mobil.torque} lb-ft"
        tvEngine.text = "${mobil.power} HP"
        if (mobil.liked) {
            likebtn.isLiked = true
        }



        Log.d("celine", mobil.toString())

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}