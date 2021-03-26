
package com.example.hackathon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.hackathon.Cart
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.internal.NavigationMenuItemView
import kotlinx.android.synthetic.main.fragment_ap.*
import kotlinx.android.synthetic.main.fragment_ds.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val apFragment = ApFragment()

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)


        setCurrentFragment(apFragment)






        bottomNavigationView.setOnNavigationItemSelectedListener{
            when (it.itemId) {
                R.id.miap -> setCurrentFragment(apFragment)
                R.id.mimc -> setCurrentFragment(McFragment())
                R.id.mids -> setCurrentFragment(DsFragment())
            }
            true
        }


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.miorder -> Intent(applicationContext, Cart::class.java).also{
                startActivity(it)
            }
        }
        return true
    }

        fun setCurrentFragment(fragment: Fragment) =
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, fragment)
                commit()
            }

}