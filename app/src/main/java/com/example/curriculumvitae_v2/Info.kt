package com.example.curriculumvitae_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.util.Patterns.EMAIL_ADDRESS
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.core.widget.doOnTextChanged
import com.google.android.material.textfield.TextInputLayout

class Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_1)


        val name = findViewById<TextView>(R.id.fullname)
        val outlineName = findViewById<TextInputLayout>(R.id.fullnamelayout)
        val email = findViewById<TextView>(R.id.textInputLayout2)
        val outlineEmail = findViewById<TextInputLayout>(R.id.email)
        val age = findViewById<TextView>(R.id.age)
        val outlineAge = findViewById<TextInputLayout>(R.id.textInputLayout)
        val next = findViewById<Button>(R.id.nextB)
        val male = findViewById<RadioButton>(R.id.Male)
        val female = findViewById<RadioButton>(R.id.Female)
        val GenderGroup = findViewById<RadioGroup>(R.id.gendergroup)
        val groupe = GenderGroup.checkedRadioButtonId
        val FM = findViewById<RadioButton>(groupe)



        next.setOnClickListener {

            val fullname = name.text.toString()
            val ageV2 = age.text.toString()
            val mail = email.text.toString()
            val genre = FM.text.toString()

            val intent = Intent(this, Skills::class.java)
            intent.putExtra("Name", fullname)
            intent.putExtra("Email", mail)
            intent.putExtra("Age", ageV2)
     //      intent.putExtra("Gender", genre)
            startActivity(intent)

        }

        fun check():Boolean{

            if (name!!.text.isEmpty()) {
                outlineName?.error = "Must not be empty!"
  return false
            }
            else {
                outlineName?.error = null

            }

            if (email!!.text.isEmpty()) {
                outlineEmail?.error = "Must not be empty!"
                return false
            }
            else if(!EMAIL_ADDRESS.matcher(email?.text!!).matches()){
                outlineEmail?.error = "Check your email!"
                return false
            }
            else {
                outlineEmail?.error = null


            }
            if (age!!.text.isEmpty()) {
                outlineAge?.error = "Must not be empty!"
  return false
            }
            else {
                outlineAge?.error = null

            }
            return true
        }



    }


}