package com.example.zamin.smartjobtimepad.login.fragment



import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.R
import com.example.zamin.smartjobtimepad.databinding.FragmentSignInBinding



class SignInFragment : BaseFragment<FragmentSignInBinding>(FragmentSignInBinding::inflate) {

    override fun onViewCreate() {
        setClick()
        txtColor()

    }
    private fun setClick() {
        binding.apply {
            btnTelCode.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction().addToBackStack(null).replace(
                  R.id.fragment_login,TelNumberFragment()).commit()
            }
        }
    }
    private fun txtColor() {
        binding.txt.setTextColor(Color.parseColor("#3e78f5"))
        val textShader: Shader = LinearGradient(0f,
            0f,
            binding.txt.getPaint().measureText(binding.txt.getText().toString()),
            binding.txt.getTextSize(),
            intArrayOf(
                Color.parseColor("#3e78f5"), Color.parseColor("#319cfc")),
            floatArrayOf(0f, 1f),
            Shader.TileMode.CLAMP)
        binding.txt.getPaint().setShader(textShader);
    }

}