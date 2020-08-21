package com.fazahidah.dodolan.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.fazahidah.dodolan.R
import com.fazahidah.dodolan.databinding.RegisterBinding

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<RegisterBinding>(this, R.layout.register)
    }
}