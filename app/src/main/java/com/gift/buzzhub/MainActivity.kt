package com.gift.buzzhub

import android.graphics.Color
import android.os.Build
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.gift.buzzhub.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding
    lateinit var signUpButtonHP: Button
    lateinit var loginButtonHP: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //status bar change colour to buzzhub Blue (Sam)
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            window.statusBarColor= Color.parseColor("#009988")
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainActivity)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        signUpButtonHP = findViewById(R.id.signUpButtonHP)
        loginButtonHP = findViewById(R.id.loginButtonHP)

        signUpButtonHP.setOnClickListener {
            var intent = Intent(this@MainActivity, SignUpPage::class.java)
            startActivity(intent)
        }
        loginButtonHP.setOnClickListener {
            var intent = Intent(this@MainActivity, HomePage::class.java)
            startActivity(intent)
        }
    }
}