package com.topanlabs.recyclerviewtopan

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.topanlabs.recyclerviewtopan.model.DetailActivity
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
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_refresh -> {
            val intent: Intent = Intent(this, Profile::class.java)
            startActivity(intent)
            true
        }
        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }
}