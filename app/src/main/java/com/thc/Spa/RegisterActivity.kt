package com.thc.Spa

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.thc.Spa.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var backtologin: TextView
    private lateinit var register: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        backtologin =  findViewById<TextView>(R.id.backtologin)
        register =  findViewById<AppCompatButton>(R.id.register)


        backtologin.setOnClickListener {
            finish()
        }


        register.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }



    }
}