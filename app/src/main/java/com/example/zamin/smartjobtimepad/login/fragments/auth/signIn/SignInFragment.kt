package com.example.zamin.smartjobtimepad.login.fragments.auth.signIn



import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.appcompat.view.menu.MenuBuilder
import androidx.appcompat.view.menu.MenuPopupHelper
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.R
import com.example.zamin.smartjobtimepad.app.dialogHelp
import com.example.zamin.smartjobtimepad.app.setGradiandColor
import com.example.zamin.smartjobtimepad.databinding.FragmentSignInBinding
import com.example.zamin.smartjobtimepad.login.fragments.auth.signUp.SignUpFragment
import com.example.zamin.smartjobtimepad.login.fragments.auth.signUp.TelNumberFragment
import com.example.zamin.smartjobtimepad.login.fragments.user.signIn.UserSingInFragment1


class SignInFragment : BaseFragment<FragmentSignInBinding>(FragmentSignInBinding::inflate){
//    var countryNames = arrayOf("O’zbekcha", "Русский", "English")
//    var flags = intArrayOf(
//        R.drawable.flag_uzbekistan,
//        R.drawable.flag_ru,
//        R.drawable.flag_en,
//    )

    @SuppressLint("SuspiciousIndentation")
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
                    R.id.fragment_login, UserSingInFragment1()).commit()
            }
            btnHelp.setOnClickListener {
                dialogHelp(requireContext())
            }
            btnLanguage.setOnClickListener{
                showPopup(it)
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

    @SuppressLint("RestrictedApi")
    private fun showPopup(view: View) {

        val menuBuilder = MenuBuilder(requireContext())
        val inflater = MenuInflater(requireContext())
        inflater.inflate(R.menu.item_language_kod, menuBuilder)
        val optionsMenu = MenuPopupHelper(requireContext(), menuBuilder, view)
        optionsMenu.setForceShowIcon(true)
        menuBuilder.setCallback(object : MenuBuilder.Callback {
            override fun onMenuItemSelected(menu: MenuBuilder, item: MenuItem): Boolean {
                when(item.itemId)
                {
                    R.id.language_uz->{
                        binding.apply {
                            languageImage.setImageResource(R.drawable.flag_uzbekistan)
                            languageText.text = "O’zbekcha"
                        }
                    }
                    R.id.language_ru->{
                        binding.apply {
                            languageImage.setImageResource(R.drawable.flag_ru)
                            languageText.text = "Русский"
                        }
                    }
                    R.id.language_en->{
                        binding.apply {
                            languageImage.setImageResource(R.drawable.flag_en)
                            languageText.text = "English"
                        }
                    }
                    else -> false
                }
                return true
            }

            override fun onMenuModeChange(menu: MenuBuilder) {}
        })
        optionsMenu.show()
    }
}