package com.example.zamin.smartjobtimepad.login.fragments.user.check

import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.app.dialogInfo
import com.example.zamin.smartjobtimepad.databinding.FragmentCheckUserPinBinding

class CheckUserPinFragment :
    BaseFragment<FragmentCheckUserPinBinding>(FragmentCheckUserPinBinding::inflate) {
    override fun onViewCreate() {
        setOnClick()
    }

    private fun setOnClick() {
        binding.apply {
            btnInfo.setOnClickListener {
                dialogInfo(requireActivity())
            }
        }
    }

}