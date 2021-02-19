package com.cesarvaliente.random_string_generator.sample

import android.app.Activity
import android.os.Bundle
//import com.cesarvaliente.random_pair_names_generator.PairNamesGenerator
import com.cesarvaliente.random_string_generator.library.StringGenerator
import com.cesarvaliente.random_string_generator.sample.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.randomStringText.text = StringGenerator.giveMeOne()
        binding.randomStringBtn.setOnClickListener {
            binding.randomStringText.text = StringGenerator.giveMeOne()
        }

//        binding.randomPairNamesText.text = PairNamesGenerator.giveMeOne()
//        binding.randomPairNamesBtn.setOnClickListener {
//            binding.randomPairNamesText.text = PairNamesGenerator.giveMeOne()
//        }
    }
}