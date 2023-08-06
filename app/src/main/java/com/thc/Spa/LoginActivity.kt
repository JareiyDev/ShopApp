package com.thc.Spa

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.thc.Spa.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var btnresgister: TextView
    private lateinit var singin: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        btnresgister =  findViewById<TextView>(R.id.btnresgister)
        singin =  findViewById<AppCompatButton>(R.id.singIn)

        btnresgister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        singin.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}