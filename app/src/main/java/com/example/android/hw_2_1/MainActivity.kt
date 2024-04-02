package com.example.android.hw_2_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.android.hw_2_1.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textBlock.setUpperMessageText("верхняя строчка, настроенная из кода")
        binding.textBlock.setLowerMessageText("нижняя строчка, настроенная из кода")
    }
}