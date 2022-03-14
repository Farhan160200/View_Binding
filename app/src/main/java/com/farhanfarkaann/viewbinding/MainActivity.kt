package com.farhanfarkaann.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.farhanfarkaann.viewbinding.databinding.ActivityMainBinding





class MainActivity : AppCompatActivity() {
    //deklarasi variable binding
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        var number = 0
        //membuat click listener pada button
        binding.btnviewbinding.setOnClickListener {
            Toast.makeText(this,"Berhasil ditambahkan",Toast.LENGTH_LONG).show()
            number += 10
            //mengubah value textView
            binding.textAngka.text = number.toString()
        }

    }
}