package com.example.zamin.smartjobtimepad.login.fragments.auth.signUp.paswordreconver

import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.R
import com.example.zamin.smartjobtimepad.app.setGradiandColor
import com.example.zamin.smartjobtimepad.databinding.FragmentPasswordRecoverCheckCodeBinding


class PasswordRecoverCheckCodeFragment : BaseFragment<FragmentPasswordRecoverCheckCodeBinding>(FragmentPasswordRecoverCheckCodeBinding::inflate) {
    override fun onViewCreate() {
        binding.txt.setGradiandColor()
        setonClick()
    }

    private fun setonClick() {
        binding.apply {
            btnNext.setOnClickListener {
                requireActivity()!!.supportFragmentManager.beginTransaction().addToBackStack("").replace(R.id.fragment_login,
                    CreateNewPasswordFragment()).commit()
            }
        }
    }

}