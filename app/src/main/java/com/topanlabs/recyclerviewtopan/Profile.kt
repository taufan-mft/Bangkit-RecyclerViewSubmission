package com.topanlabs.recyclerviewtopan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val actionbar = supportActionBar
        actionbar!!.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayShowHomeEnabled(true)
        actionbar.title = "Profil"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}