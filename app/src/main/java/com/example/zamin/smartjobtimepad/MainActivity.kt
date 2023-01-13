package com.example.zamin.smartjobtimepad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zamin.smartjobtimepad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Bismillahir rohmanir rohim!!!
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}