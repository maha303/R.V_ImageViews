package com.example.rv_imageviews

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.rv_imageviews.R.drawable.moon

class MainActivity : AppCompatActivity() {

    private lateinit var im:ImageView
    private lateinit var btnA:Button
    private lateinit var btnB:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        im=findViewById(R.id.imageView)
        btnA=findViewById(R.id.btnA)
        btnA.setOnClickListener {
            val d =resources.getDrawable(R.drawable.moon)
            im.setImageDrawable(d)
        }
        btnB=findViewById(R.id.btnB)

        btnB.setOnClickListener {
            val d =resources.getDrawable(R.drawable.cloud)
            im.setImageDrawable(d)
        }

    }
}