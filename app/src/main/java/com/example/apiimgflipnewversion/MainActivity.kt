package com.example.apiimgflipnewversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apiimgflipnewversion.presentation.ui.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.home_fragment, homeFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}