package com.example.zamin.smartjobtimepad.login.fragments.user.signIn
import android.content.Context
import android.content.Intent
import android.hardware.camera2.CameraAccessException
import android.hardware.camera2.CameraManager
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat.getSystemService
import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.MainActivity
import com.example.zamin.smartjobtimepad.R
import com.example.zamin.smartjobtimepad.app.dialogInfo
import com.example.zamin.smartjobtimepad.app.setGradiandColor
import com.example.zamin.smartjobtimepad.databinding.FragmentUserSingIn1Binding
import com.example.zamin.smartjobtimepad.login.fragments.auth.signIn.QrCodeScanerFragment
import com.example.zamin.smartjobtimepad.login.fragments.user.check.CheckUserFaceIDFragment
import com.example.zamin.smartjobtimepad.login.fragments.user.check.CheckUserPinFragment


class UserSingInFragment1 : BaseFragment<FragmentUserSingIn1Binding>(FragmentUserSingIn1Binding::inflate) {
    override fun onViewCreate() {
    binding.txt.setGradiandColor()
    binding.txt1.setGradiandColor()
        setOnClick()
    }
    private fun setOnClick() {
        binding.apply {
            btnInfo.setOnClickListener {
                dialogInfo(requireActivity())
            }
            btnPin.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction().addToBackStack("")
                    .replace(
                        R.id.fragment_login, CheckUserPinFragment()).commit()
            }
            btnQrCode.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction().addToBackStack("")
                    .replace(
                        R.id.fragment_login, QrCodeScanerFragment()).commit()
            }
            btnFaceId.setOnClickListener {
                startActivity(Intent(requireContext(),MainActivity::class.java))
            }


        }
    }




}