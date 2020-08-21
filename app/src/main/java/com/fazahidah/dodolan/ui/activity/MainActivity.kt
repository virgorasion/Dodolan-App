package com.fazahidah.dodolan.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.fazahidah.dodolan.R
import com.fazahidah.dodolan.databinding.ActivityMainBinding
import com.fazahidah.dodolan.model.DataDummy

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val data = DataDummy("Penghasilan Bulan Ini", "Rp2.000.000", 2020, "Keuntungan Bulan Ini", "Rp200.000", 2020, "Penjualan Hari Ini", 20,2020,"Total Penghutang", 5,2020)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )
        binding.dataDummy = data
    }

    fun clickHandlerFunction(view: View) {

    }
}