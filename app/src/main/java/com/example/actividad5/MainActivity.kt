package com.example.actividad5

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.actividad5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.lblTitulo.text="App pasar parametros"

        val miTxtValor = binding.TxtValor
        val miBtnEnviar = binding.btnEnviar

        miBtnEnviar.setOnClickListener {
            val intento1 = Intent(this, MainActivity2::class.java)
            intento1.putExtra("nombre", miTxtValor.text.toString())
            startActivity(intento1)
        }
    }
}