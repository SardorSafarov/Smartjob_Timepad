package com.example.zamin.smartjobtimepad.app

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.widget.LinearLayout
import android.widget.TextView
import com.example.zamin.smartjobtimepad.R
import com.example.zamin.smartjobtimepad.databinding.AlertDialogInfoBinding


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
fun dialogInfo(context: Context) {
    val dialog = Dialog(context)
    val view = LinearLayout.inflate(context, R.layout.alert_dialog_info,null)
    val dialogBinding = AlertDialogInfoBinding.bind(view)
    dialog.setContentView(dialogBinding.root)
    dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    dialogBinding.btnCancel.setOnClickListener {
        dialog.dismiss()
    }
    dialog.show()
}
