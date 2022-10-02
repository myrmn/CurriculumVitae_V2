package com.example.curriculumvitae_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result)

        val intent = intent
        val FullName = intent.getStringExtra("Name")
        val age = intent.getStringExtra("Age")
        val mail = intent.getStringExtra("Email")
        val gender= intent.getStringExtra("Gender")
        val androidskill=intent.getStringExtra("Android")
        val iosSkill = intent.getStringExtra("iOS")
        val flutterskill = intent.getStringExtra("Flutter")
        val language = intent.getStringExtra("Language")
        val hbs = intent.getStringExtra("Hobbies")

        val name= findViewById<TextView>(R.id.name)
        val email= findViewById<TextView>(R.id.emaild)
        val agee= findViewById<TextView>(R.id.aged)
        val genre= findViewById<TextView>(R.id.genderd)
        val android= findViewById<TextView>(R.id.androidd)
        val ios= findViewById<TextView>(R.id.iosd)
        val flutter= findViewById<TextView>(R.id.flutterd)
        val lang= findViewById<TextView>(R.id.langd)
        val hobbies= findViewById<TextView>(R.id.hobbiesd)


        
        name.text="Name:$FullName"
        email.text="Email:$mail"
        agee.text="Age:$age"
        genre.text="Gender:$gender"
        android.text="AndroidSkill:$androidskill"
        ios.text="IosSkill:$iosSkill"
        flutter.text="FlutterSkill:$flutterskill"
        lang.text="Languages:$language"
        hobbies.text="Hobbies:$hbs"




    }
}