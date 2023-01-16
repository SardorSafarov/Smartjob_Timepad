package com.example.zamin.smartjobtimepad.login.fragments.auth.signUp

import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.R
import com.example.zamin.smartjobtimepad.databinding.FragmentTelNumberBinding
import com.example.zamin.smartjobtimepad.login.fragments.auth.signIn.SignInFragment


class TelNumberFragment : BaseFragment<FragmentTelNumberBinding>(FragmentTelNumberBinding::inflate) {

    override fun onViewCreate() {
    onClick()
    }

    private fun onClick() {
        binding.apply {
            btnCancel.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction()
                    .remove(this@TelNumberFragment).replace(R.id.fragment_login, SignInFragment())
                    .commit()
            }
        }
    }


}