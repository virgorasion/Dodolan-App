package com.fazahidah.dodolan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.fazahidah.dodolan.databinding.ActivityMainBinding
import com.fazahidah.dodolan.DataDummy

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val order: DataDummy = DataDummy("Total Pesanan", value = 2020)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = order
    }
}