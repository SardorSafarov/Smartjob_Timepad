package com.example.zamin.smartjobtimepad.login.fragments.auth.signUp

import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.R
import com.example.zamin.smartjobtimepad.app.setGradiandColor
import com.example.zamin.smartjobtimepad.databinding.FragmentSignUp2Binding

class SignUp2Fragment : BaseFragment<FragmentSignUp2Binding>(FragmentSignUp2Binding::inflate) {
    override fun onViewCreate() {
        binding.txt.setGradiandColor()
        setOnclick()
    }
    private fun setOnclick() {
        binding.apply {
            btnNext.setOnClickListener {
                requireActivity()!!.supportFragmentManager.beginTransaction().replace(R.id.fragment_login,
                    CheckPhoneCodeFragment()).addToBackStack("").commit()
            }
        }
    }
}