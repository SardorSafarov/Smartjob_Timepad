package com.example.zamin.smartjobtimepad.login.fragments.paswordreconver

import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.R
import com.example.zamin.smartjobtimepad.app.setGradiandColor
import com.example.zamin.smartjobtimepad.databinding.FragmentPasswordRecoverBinding

class PasswordRecoverPhoneFragment : BaseFragment<FragmentPasswordRecoverBinding>(FragmentPasswordRecoverBinding::inflate) {
    override fun onViewCreate() {
        binding.txt.setGradiandColor()
        setOnClick()
    }

    private fun setOnClick() {
        binding.apply {
            btnNext.setOnClickListener {
                requireActivity()!!.supportFragmentManager.beginTransaction().addToBackStack("").replace(
                    R.id.fragment_login, PasswordRecoverCheckCodeFragment()).commit()
            }
        }
    }

}