package com.example.sem08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sem08.databinding.ActivityMainBinding
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    //Objeto Firebase
    private lateinit var auth : FirebaseAuth

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_main)


        //Inicializar
        FirebaseApp.initializeApp(this)
        auth = Firebase.auth
    }
}