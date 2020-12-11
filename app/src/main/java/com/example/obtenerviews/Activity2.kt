package com.example.obtenerviews

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class Activity2 : AppCompatActivity() {
    companion object {
        const val CLAVE = "dos"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        val contraseña = findViewById<TextView>(R.id.t1)
        val button3 = findViewById<Button>(R.id.b3)
        val button4 = findViewById<Button>(R.id.b4)
        val respuesta=findViewById<TextView>(R.id.t2)


        button3.setOnClickListener{

           val aux = intent.getStringExtra(CLAVE)
            aux?.let {
                if(contraseña.getText().equals(aux)==true){
                    respuesta.setText("Contraseña correcta")
                }else{
                    respuesta.setText("Error contraseña incorrecta")
                }
            }
        }
        button4.setOnClickListener{
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)

        }


    }
}




