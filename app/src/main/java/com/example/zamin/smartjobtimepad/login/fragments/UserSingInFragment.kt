package com.example.zamin.smartjobtimepad.login.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.R
import com.example.zamin.smartjobtimepad.app.setGradiandColor
import com.example.zamin.smartjobtimepad.databinding.FragmentUserSingInBinding

class UserSingInFragment : BaseFragment<FragmentUserSingInBinding>(FragmentUserSingInBinding::inflate) {
    override fun onViewCreate() {
    binding.txt.setGradiandColor()
    binding.txt1.setGradiandColor()
    }

}