package com.example.zamin.smartjobtimepad.login.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.R
import com.example.zamin.smartjobtimepad.databinding.FragmentTelNumberBinding

class TelNumberFragment : BaseFragment<FragmentTelNumberBinding>(FragmentTelNumberBinding::inflate) {

    override fun onViewCreate() {
    onClick()
    }

    private fun onClick() {
        binding.apply {
            btnCancel.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragment_login,SignInFragment()).commit()
            }
        }
    }


}