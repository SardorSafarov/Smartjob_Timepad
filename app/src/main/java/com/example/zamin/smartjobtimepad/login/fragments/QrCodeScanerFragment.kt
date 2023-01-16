package com.example.zamin.smartjobtimepad.login.fragments

import android.os.Build
import android.view.WindowManager
import com.budiyev.android.codescanner.*
import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.databinding.FragmentQrCodeScanerBinding

class QrCodeScanerFragment : BaseFragment<FragmentQrCodeScanerBinding>(FragmentQrCodeScanerBinding::inflate) {
    private val codeScanner: CodeScanner by lazy { CodeScanner(requireContext(), binding.qrCode) }
    override fun onViewCreate() {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
            requireActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        startScaneer()
    }

    fun startScaneer() {
        binding.apply {
            codeScanner.camera = CodeScanner.CAMERA_BACK
            codeScanner.formats = CodeScanner.ALL_FORMATS
            codeScanner.autoFocusMode = AutoFocusMode.SAFE
            codeScanner.scanMode = ScanMode.SINGLE
            codeScanner.isAutoFocusEnabled = true
            codeScanner.isFlashEnabled = false

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