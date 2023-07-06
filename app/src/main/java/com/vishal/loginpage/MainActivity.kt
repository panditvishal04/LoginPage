package com.vishal.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var name : EditText
    lateinit var email :EditText
    lateinit var pass : EditText
    lateinit var btn : Button
    lateinit var btn1 :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.et_name)
        email = findViewById(R.id.et_email)
        pass = findViewById(R.id.et_pass)

    }
}