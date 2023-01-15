package com.example.zamin.smartjobtimepad.login.fragment


import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.R
import com.example.zamin.smartjobtimepad.databinding.FragmentSignInBinding

class SignInFragment : BaseFragment<FragmentSignInBinding>(FragmentSignInBinding::inflate) {

    override fun onViewCreate() {
        setClick()
    }

    private fun setClick() {
        binding.apply {
            btnTelCode.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction().addToBackStack(null).replace(R.id.fragment_login,TelNumberFragment()).commit()
            }
        }
    }

}