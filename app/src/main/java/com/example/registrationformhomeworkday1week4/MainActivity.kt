package com.example.registrationformhomeworkday1week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registrationformhomeworkday1week4.databinding.ActivityMainBinding


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
        val name = binding.Name.text
        val email = binding.email.text
        val pass1 = binding.password.text
        val pass2 = binding.repassword.text
        val genderF = binding.femaleBottun.isChecked
        var result = binding.Result.text
        val birthDate = binding.Birthdate.text
        // checking if any information is empty
     val info =   if (name.toString().isEmpty() || email.toString().isEmpty() ||
            pass1.toString().isEmpty() || pass2.toString().isEmpty()) {
            "You left some blanks pls fill them"
        } else if (pass1.toString() != pass2.toString()){
            "please make sure you have putted the correct passwprd "}
     else if(email.toString().contains('.') == false || email.toString().contains('@') == false ) "pleas enter valiable email"
     // printing the user input information
     else "\n${name} \n${if (genderF){"Female"}else "male" } \n${birthDate} \n${email} \n${pass1} \n${pass2}"
        // formatting the input into suitable format
        val formattedInfo = info.format()
        result = formattedInfo
    }

}