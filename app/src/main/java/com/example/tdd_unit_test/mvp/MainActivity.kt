package com.example.tdd_unit_test.mvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.tdd_unit_test.R

class MainActivity : AppCompatActivity(), MainContract.MvpView {
    private lateinit var btnSignIn: Button
    private lateinit var btnSignUp: Button

    private lateinit var mainPresenter: MainPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter = MainPresenter(this);
        btnSignIn = findViewById(R.id.btnSignIn) as Button
        btnSignUp = findViewById(R.id.btnSignUp) as Button
        buttonAction()

    }

    private fun buttonAction() {
        btnSignIn.setOnClickListener {
            navigateToSignIn()
        };
        btnSignUp.setOnClickListener {
            navigateToSignUp()
        };
    }

    override fun navigateToSignIn() {
        Toast.makeText(this,"Welcome SignIn",Toast.LENGTH_LONG).show()
    }

    override fun navigateToSignUp() {
        Toast.makeText(this,"Welcome SignUp",Toast.LENGTH_LONG).show()
    }
}
