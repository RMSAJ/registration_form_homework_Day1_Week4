package com.example.registrationformhomeworkday1week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registrationformhomeworkday1week4.databinding.ActivityMainBinding
import com.google.android.material.resources.TextAppearance
import java.text.Format

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    binding.registrationButtonId.setOnClickListener { showInfo() }
    }

    fun showInfo(){
        // checking if any information is empty
     val info =   if (binding.Name.text.toString().isEmpty() || binding.email.text.toString().isEmpty() ||
            binding.password.text.toString().isEmpty() || binding.repassword.text.toString().isEmpty()) {
            "You left some blanks pls fill them"
        } else if (binding.password.text.toString() != binding.repassword.text.toString()){
            "please make sure you have putted the correct passwprd "}
     // printing the user input information
     else "\n${binding.Name.text} \n${if (binding.femaleBottun.isChecked){"Female"}else "male" } \n${binding.Birthdate.text} \n${binding.email.text} \n${binding.password.text} \n${binding.repassword.text}"
        // formatting the input into suitable format
        val formattedInfo = info.format()
        binding.Result.text = formattedInfo
    }

}