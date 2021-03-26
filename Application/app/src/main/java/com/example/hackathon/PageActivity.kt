package com.example.hackathon

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.page1.*

class PageActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page1)
        btncart.setOnClickListener {
            Intent(this, Cart::class.java).apply{
            startActivity(this)

            }
        }
        }
}