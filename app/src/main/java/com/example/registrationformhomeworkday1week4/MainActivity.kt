package com.example.registrationformhomeworkday1week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

    private fun showInfo() {

//        Toast.makeText(MainActivity@ this, "in fun", Toast.LENGTH_SHORT).show()
        val genderF = binding.femaleBottun.isChecked
        val name = binding.nameEditText.text.toString()
        val email = binding.emaimEditText.text.toString()
        val pass1 = binding.passwordEditText.text.toString()
        val pass2 = binding.repasswordEditText.text.toString()
        val birthDate = binding.BirthdateEditText.text.toString()

        // checking if any information is empty
        var result = if (name.isEmpty() || email.isEmpty() ||
            pass1.isEmpty() || pass2.isEmpty() || birthDate.isEmpty()) {
            "You left some blanks pls fill them"
        } else if (pass1 != pass2) {
            "pls put the correct password "
        } else if (!email.contains('.') || !email.contains('@')) "pleas enter valiable email"
        // printing the user input information
        else {
            "\n ${name} \n ${
                if (genderF) {
                    "Female"
                } else "male"
            } \n${birthDate} \n${email} \n${pass1} \n${pass2}"
        }
        binding.Result.text = result

        //
        // formatting the input into suitable format


    }

}