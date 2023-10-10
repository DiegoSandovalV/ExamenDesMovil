package com.example.examen.framework.views.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.examen.R
import com.example.examen.databinding.ActivityMainBinding
import com.example.examen.framework.views.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    // Variables de clase
    private lateinit var currentFragment: Fragment
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initBinding()
        exchangeCurrentFragment(HomeFragment())

    }

    /**
     * Función que intercambia el fragmento actual por el que se le pasa como parámetro
     */
    private fun exchangeCurrentFragment(newFragment: Fragment) {
        currentFragment = newFragment

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, currentFragment)
            .commit()
    }

    /**
     * Función que inicializa el binding
     */
    private fun initBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}


