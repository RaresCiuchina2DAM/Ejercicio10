package com.example.ejercicio10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10.databinding.ActivityCiudadBinding
import com.example.ejercicio10.databinding.ActivityObjetoBinding

class ObjetoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityObjetoBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_objeto)



        binding.BtnRecoger.setOnClickListener {
            val intent = Intent(this, BlancaActivity::class.java)
            startActivity(intent)
        }


        binding.BtnContinuar.setOnClickListener {
            val intent = Intent(this, DadoActivity::class.java)
            startActivity(intent)
        }
    }
}