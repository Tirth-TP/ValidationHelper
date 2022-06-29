package com.example.validationhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.validationhelper.databinding.ActivityMainBinding
import com.example.validationhelper.helper.emailValidationHelper
import com.example.validationhelper.helper.emptyValidationHelper
import com.example.validationhelper.helper.passwordValidationHelper
import com.example.validationhelper.helper.phoneValidationHelper

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            emptyValidationHelper(binding.etUsername)
            passwordValidationHelper(binding.etPassword)
            phoneValidationHelper(binding.etPhone)
            emailValidationHelper(binding.etEmail)
        }


    }
}