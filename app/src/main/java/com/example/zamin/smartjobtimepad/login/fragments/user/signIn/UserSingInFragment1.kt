package com.example.zamin.smartjobtimepad.login.fragments.user.signIn
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.LinearLayout
import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.R
import com.example.zamin.smartjobtimepad.app.setGradiandColor
import com.example.zamin.smartjobtimepad.databinding.AlertDialogInfoBinding
import com.example.zamin.smartjobtimepad.databinding.FragmentUserSingIn1Binding


class UserSingInFragment1 : BaseFragment<FragmentUserSingIn1Binding>(FragmentUserSingIn1Binding::inflate) {
    override fun onViewCreate() {
    binding.txt.setGradiandColor()
    binding.txt1.setGradiandColor()
        setOnClick()
    }
    private fun setOnClick() {
        binding.apply {
            btnInfo.setOnClickListener {
                dialogInfo()
            }

        }
    }

    private fun dialogInfo() {
        val dialog = Dialog(requireContext())
        val view = LinearLayout.inflate(requireContext(),R.layout.alert_dialog_info,null)
        val dialogBinding = AlertDialogInfoBinding.bind(view)
        dialog.setContentView(dialogBinding.root)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialogBinding.btnCancel.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

}