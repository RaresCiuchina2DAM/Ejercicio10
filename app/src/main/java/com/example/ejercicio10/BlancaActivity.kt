package com.example.ejercicio10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicio10.databinding.ActivityBlancaBinding

class BlancaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBlancaBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}