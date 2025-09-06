package com.example.actividad5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.actividad5.databinding.ActivityMain2Binding
import com.example.actividad5.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding2: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding2.root
        setContentView(view)

        val bundle = intent.extras
        val dato = bundle?.getString("nombre")

        binding2.lblDisplayNombre.text = "Mi nombre es: $dato"

        binding2.btnRegresa.setOnClickListener {
            finish()
        }

    }
}