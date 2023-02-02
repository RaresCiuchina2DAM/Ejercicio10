package com.example.ejercicio10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10.databinding.ActivityBlancaBinding
import com.example.ejercicio10.databinding.ActivityCiudadBinding

class BlancaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBlancaBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_blanca)
    }
}