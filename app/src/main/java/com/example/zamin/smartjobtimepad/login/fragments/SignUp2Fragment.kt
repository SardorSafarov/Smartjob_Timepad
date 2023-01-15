package com.example.zamin.smartjobtimepad.login.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
                requireActivity()!!.supportFragmentManager.beginTransaction().replace(R.id.fragment_login,CheckPhoneCodeFragment()).addToBackStack("").commit()
            }
        }
    }
}