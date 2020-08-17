package com.fazahidah.dodolan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.fazahidah.dodolan.databinding.ActivityMainBinding
import com.fazahidah.dodolan.model.DataDummy

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val order = DataDummy("Total Pesanan", 2020, 2020)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.dataDummy = order
    }
}