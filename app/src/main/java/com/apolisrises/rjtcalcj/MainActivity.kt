package com.apolisrises.rjtcalcj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.apolisrises.rjtcalcj.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener {
            val a = binding.etN1.text.toString().toInt()
            val b = binding.etN2.text.toString().toInt()
            val addition = a + b
            Toast.makeText(baseContext, "Addition is $addition", Toast.LENGTH_SHORT).show()
        }

        binding.btnAdd.setOnClickListener {
            val a = binding.etN1.text.toString().toInt()
            val b = binding.etN2.text.toString().toInt()
            val multiplication = a * b
            Toast.makeText(baseContext, "Addition is $multiplication", Toast.LENGTH_SHORT).show()
        }
    }
}