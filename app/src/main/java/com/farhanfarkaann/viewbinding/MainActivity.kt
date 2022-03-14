package com.farhanfarkaann.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farhanfarkaann.viewbinding.databinding.ActivityMainBinding

//deklarasi variable binding
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        var number = 1
        //membuat click listener pada button
        binding.btnviewbinding.setOnClickListener {
            number += 1
            //mengubah value textView
            binding.tvNumber.text = number.toString()
        }

    }
}