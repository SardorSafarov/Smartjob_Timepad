package com.example.zamin.smartjobtimepad.login.loginActivity

import android.R
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.text.TextPaint
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.zamin.smartjobtimepad.databinding.ActivityLoginBinding
import java.util.*


class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val paint = txt.paint
            val width = paint.measureText(txt.text.toString())
            val textShader: Shader = LinearGradient(0f, 0f, width, txt.textSize, intArrayOf(
                Color.parseColor("#3f77f5"),
                Color.parseColor("#4ba8fc")
            ), null, Shader.TileMode.REPEAT)

            txt.paint.setShader(textShader)
        }

    }
}