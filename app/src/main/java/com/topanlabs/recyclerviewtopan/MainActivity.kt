package com.topanlabs.recyclerviewtopan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.topanlabs.recyclerviewtopan.model.MercedesCar
import com.topanlabs.recyclerviewtopan.model.MercedesData

class MainActivity : AppCompatActivity() {
    private lateinit var rvMobil: RecyclerView
    var list: ArrayList<MercedesCar> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMobil = findViewById(R.id.rv_heroes)
        rvMobil.setHasFixedSize(true)

        list.addAll(MercedesData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvMobil.layoutManager = LinearLayoutManager(this)
        val listMerciAdapter = AdapterMerci(list, this)
        rvMobil.adapter = listMerciAdapter
    }

}