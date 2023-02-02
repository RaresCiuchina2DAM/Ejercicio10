package com.example.ejercicio10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.ejercicio10.databinding.ActivityMercaderBinding

class MercaderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMercaderBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_mercader)


        binding.BtnComerciar .setOnClickListener {
            val intent = Intent(this, BlancaActivity::class.java)
            startActivity(intent)
        }


        binding.BtnContinuar.setOnClickListener{
            val intent = Intent(this, DadoActivity::class.java)
            startActivity(intent)
        }






    }
}