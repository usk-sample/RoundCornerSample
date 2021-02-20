package com.example.roundcornersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.roundcornersample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.roundListView.adapter = RoundAdapter(isCircle = false)
        binding.circleListView.adapter = RoundAdapter(isCircle = true)
        binding.listView.adapter = MaterialAdapter()

    }
}