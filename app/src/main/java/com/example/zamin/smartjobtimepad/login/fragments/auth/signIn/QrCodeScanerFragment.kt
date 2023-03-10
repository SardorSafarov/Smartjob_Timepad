package com.example.zamin.smartjobtimepad.login.fragments.auth.signIn


import com.budiyev.android.codescanner.*
import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.databinding.FragmentQrCodeScanerBinding

class QrCodeScanerFragment : BaseFragment<FragmentQrCodeScanerBinding>(FragmentQrCodeScanerBinding::inflate) {
    var flash = true
    private val codeScanner: CodeScanner by lazy { CodeScanner(requireContext(), binding.qrCode) }
    override fun onViewCreate() {
        startScaneer()
        setOnClick()
    }

    private fun setOnClick() {
        binding.apply {
            btnFlash.setOnClickListener {
                if (flash){
                    codeScanner.isFlashEnabled = true
                }else{
                    codeScanner.isFlashEnabled = false
                }
                flash = !flash
            }
        }
    }


    fun startScaneer() {
        binding.apply {
            codeScanner.camera = CodeScanner.CAMERA_BACK
            codeScanner.formats = CodeScanner.ALL_FORMATS
            codeScanner.autoFocusMode = AutoFocusMode.SAFE
            codeScanner.scanMode = ScanMode.SINGLE
            codeScanner.isAutoFocusEnabled = true


            codeScanner.decodeCallback = DecodeCallback { result ->
                requireActivity().runOnUiThread {

                }
            }
            codeScanner.errorCallback = ErrorCallback {
                requireActivity().runOnUiThread {

                }
            }

        }
    }

    override fun onResume() {
        super.onResume()
        codeScanner.startPreview()
    }

    override fun onPause() {
        codeScanner.releaseResources()
        super.onPause()
    }
}