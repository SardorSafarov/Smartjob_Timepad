package com.example.zamin.smartjobtimepad.login.fragments.auth.signUp

import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.R
import com.example.zamin.smartjobtimepad.app.setGradiandColor
import com.example.zamin.smartjobtimepad.databinding.FragmentSignUpBinding


class SignUpFragment : BaseFragment<FragmentSignUpBinding>(FragmentSignUpBinding::inflate) {
    override fun onViewCreate() {
        binding.txt.setGradiandColor()
        setOnclick()
    }

    private fun setOnclick() {
        binding.apply {
            btnNext.setOnClickListener {
                requireActivity()!!.supportFragmentManager.beginTransaction().replace(R.id.fragment_login,
                    SignUp2Fragment()).addToBackStack("").commit()
            }
        }
    }

}