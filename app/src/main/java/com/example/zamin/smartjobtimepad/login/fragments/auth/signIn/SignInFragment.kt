package com.example.zamin.smartjobtimepad.login.fragments.auth.signIn



import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.R
import com.example.zamin.smartjobtimepad.app.setGradiandColor
import com.example.zamin.smartjobtimepad.databinding.FragmentSignInBinding
import com.example.zamin.smartjobtimepad.login.fragments.UserSingInFragment
import com.example.zamin.smartjobtimepad.login.fragments.auth.signUp.SignUpFragment
import com.example.zamin.smartjobtimepad.login.fragments.auth.signUp.TelNumberFragment


class SignInFragment : BaseFragment<FragmentSignInBinding>(FragmentSignInBinding::inflate) {

    override fun onViewCreate() {
        chackCameraPerimition()
        setClick()
        binding.txt.setGradiandColor()

    }
    private fun setClick() {
        binding.apply {
            btnTelCode.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction().addToBackStack(null).replace(
                  R.id.fragment_login, TelNumberFragment()).commit()
            }
            btnSignUp.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction().addToBackStack(null).replace(
                    R.id.fragment_login, SignUpFragment()).commit()
            }
            btnQrCode.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction().addToBackStack(null).replace(
                    R.id.fragment_login, QrCodeScanerFragment()).commit()
            }
            btnNext.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction().addToBackStack(null).replace(
                    R.id.fragment_login, UserSingInFragment()).commit()
            }
        }


    }
    private fun chackCameraPerimition() {

        if (ContextCompat.checkSelfPermission(
                requireActivity(),
                android.Manifest.permission.CAMERA
            ) == PackageManager.PERMISSION_DENIED
        ) {
            ActivityCompat.requestPermissions(
                requireActivity(),
                arrayOf(android.Manifest.permission.CAMERA),
                123
            )
        }

    }

}