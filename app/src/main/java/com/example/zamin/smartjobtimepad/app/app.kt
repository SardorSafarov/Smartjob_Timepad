package com.example.zamin.smartjobtimepad.app

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.util.Log
import android.widget.TextView
import com.example.zamin.smartjobtimepad.R


fun D(message:String)
{
    Log.d("sardor","->>>>>>    $message    <<<<<<-")
}


fun TextView.setGradiandColor(startColor: Int = Color.parseColor("#3e77f5"),endColor: Int = Color.parseColor("#309cfc")){
    this.setTextColor(startColor)
    val textShader: Shader = LinearGradient(0f,
        0f,
        this.getPaint().measureText(this.getText().toString()),
        this.getTextSize(),
        intArrayOf(
            startColor, endColor),
        floatArrayOf(0f, 1f),
        Shader.TileMode.CLAMP)
    this.getPaint().setShader(textShader);
}

