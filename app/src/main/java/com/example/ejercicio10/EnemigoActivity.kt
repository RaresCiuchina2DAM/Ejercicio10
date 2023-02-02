package com.example.ejercicio10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10.databinding.ActivityCiudadBinding
import com.example.ejercicio10.databinding.ActivityEnemigoBinding

class EnemigoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityEnemigoBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_enemigo)


        binding.BtnLucharEnemigo.setOnClickListener {
            val intent = Intent(this, BlancaActivity::class.java)
            startActivity(intent)
        }


        binding.BtnHuir.setOnClickListener{
            val intent = Intent(this, DadoActivity::class.java)
            startActivity(intent)
        }


    }
}