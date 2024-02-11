package com.example.secondapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)
        val btn3 = findViewById<Button>(R.id.button3)

        btn1.setOnClickListener{
            intent = Intent(applicationContext, Second_Screen::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener{
            val web = Intent(Intent.ACTION_VIEW)
            web.data = Uri.parse("https://github.com/ZHANIK2003")
        }
        btn3.setOnClickListener{
            val camera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(camera)
        }
    }
}