package com.example.zamin.smartjobtimepad.login.fragments.paswordreconver

import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.app.setGradiandColor
import com.example.zamin.smartjobtimepad.databinding.FragmentCreateNewPasswordBinding


class CreateNewPasswordFragment :
    BaseFragment<FragmentCreateNewPasswordBinding>(FragmentCreateNewPasswordBinding::inflate) {
    override fun onViewCreate() {
        binding.txt.setGradiandColor()
    }

}