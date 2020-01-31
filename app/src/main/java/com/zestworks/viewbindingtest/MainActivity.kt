package com.zestworks.viewbindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.zestworks.viewbindingtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val b = binding.helloWorld == null
        val b1 = binding.worldHello == null
        Log.d("helloWorld null : ", b.toString())
        Log.d("worldHello null : ", b1.toString())
    }
}