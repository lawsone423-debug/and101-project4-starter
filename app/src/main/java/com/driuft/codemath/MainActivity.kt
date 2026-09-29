package com.example.codemath

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.codemath.databinding.ActivityMainBinding
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.btnAdd.setOnClickListener {
            val num1 = binding.input1.text.toString().toDoubleOrNull()
            val num2 = binding.input2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                binding.result.text = (num1 + num2).toString()
            }
        }

         binding.btnSubtract.setOnClickListener {
            val num1 = binding.input1.text.toString().toDoubleOrNull()
            val num2 = binding.input2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                binding.result.text = (num1 - num2).toString()
            }
        }

        binding.btnMultiply.setOnClickListener {
            val num1 = binding.input1.text.toString().toDoubleOrNull()
            val num2 = binding.input2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                binding.result.text = (num1 * num2).toString()
            }
        }

        binding.btnDivide.setOnClickListener {
            val num1 = binding.input1.text.toString().toDoubleOrNull()
            val num2 = binding.input2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null && num2 != 0) {
                binding.result.text = (num1 / num2).toString()
            } else if (num2 == 0) {
                binding.result.text = "Error: Division by zero"
            }
        }
    }
}
