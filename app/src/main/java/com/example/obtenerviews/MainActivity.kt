package com.example.obtenerviews

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.obtenerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{
                binding.button.setText("Contraseña Guardada")
        }

        binding.b2.setOnClickListener{
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra(Activity2.CLAVE, binding.password.getText().toString())
            startActivity(intent)

        }

    }

}


