package com.example.zamin.smartjobtimepad.login.fragments.user.signIn
import com.example.zamin.smartjobtimepad.BaseFragment
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
                requireActivity().supportFragmentManager.beginTransaction().addToBackStack("")
                    .replace(
                        R.id.fragment_login, CheckUserFaceIDFragment()).commit()
            }


        }
    }


}