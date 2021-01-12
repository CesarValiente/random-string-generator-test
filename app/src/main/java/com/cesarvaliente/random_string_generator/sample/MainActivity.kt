package com.cesarvaliente.random_string_generator.sample

import android.app.Activity
import android.os.Bundle
import com.cesarvaliente.random_string_generator.library.StringGenerator
import com.cesarvaliente.random_string_generator.sample.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.stringText.text = StringGenerator.giveMeOne()
        binding.stringBtn.setOnClickListener {
            binding.stringText.text = StringGenerator.giveMeOne()
        }
    }
}