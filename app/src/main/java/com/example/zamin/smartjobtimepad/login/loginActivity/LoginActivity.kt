package com.example.zamin.smartjobtimepad.login.loginActivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.zamin.smartjobtimepad.R
import com.example.zamin.smartjobtimepad.databinding.ActivityLoginBinding
import com.example.zamin.smartjobtimepad.login.fragments.auth.signIn.SignInFragment


class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().replace(R.id.fragment_login,
            SignInFragment()).commit()
    }
}