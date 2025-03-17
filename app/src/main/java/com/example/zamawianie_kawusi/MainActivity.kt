package com.example.zamawianie_kawusi

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

            val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
            val imageView: ImageView = findViewById(R.id.imageview)
            val radioEspresso = findViewById<RadioButton>(R.id.radioespresso)
            val radioLatte = findViewById<RadioButton>(R.id.radiolatte)
            val radioCapuccino = findViewById<RadioButton>(R.id.radiocappuccino)

            radioEspresso.setOnCheckedChangeListener { _, isChecked ->
                imageView.setImageResource(R.drawable.espresso)
            }

            radioLatte.setOnCheckedChangeListener { _, isChecked ->
                imageView.setImageResource(R.drawable.latte)
            }

        radioCapuccino.setOnCheckedChangeListener { _, isChecked ->
            imageView.setImageResource(R.drawable.capuccino)
        }


            val myTextView: TextView = findViewById(R.id.textview2)
            val myseekBar = findViewById<SeekBar>(R.id.seekBar)
            myseekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    myTextView.text = "wartosc suwaka: $p1"
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {

                }

                override fun onStopTrackingTouch(p0: SeekBar?) {

                }




        })
    }
}


