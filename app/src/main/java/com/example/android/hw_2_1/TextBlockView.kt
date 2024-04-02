package com.example.android.hw_2_1

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.example.android.hw_2_1.databinding.TextBlockViewBinding

class TextBlockView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    private val binding: TextBlockViewBinding
    init {
        val inflateView = inflate (context, R.layout.text_block_view, this)
        binding = TextBlockViewBinding.bind(inflateView)
    }
    fun setUpperMessageText(message: String) {
        binding.upperText.text = message
    }
    fun setLowerMessageText(message: String) {
        binding.lowerText.text = message
    }
}