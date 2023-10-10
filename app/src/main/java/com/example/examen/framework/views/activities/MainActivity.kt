package com.example.examen.framework.views.activities

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.examen.R
import com.example.examen.databinding.ActivityMainBinding
import com.example.examen.framework.views.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var currentFragment: Fragment
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initBinding()
        exchangeCurrentFragment(HomeFragment())

    }

    private fun exchangeCurrentFragment(newFragment: Fragment){
        currentFragment = newFragment

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer,currentFragment)
            .commit()
    }

    private fun initBinding(){
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}


