package com.example.tdd_unit_test.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tdd_unit_test.R

class MainActivity : AppCompatActivity(), MainContract.MvpView {

    private lateinit var mainPresenter: MainPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter = MainPresenter(this);

    }

    override fun navigateToSignIn() {
    Toast.makeText(this,"Welcome",Toast.LENGTH_LONG)
    }

    override fun navigateToSignUp() {
        Toast.makeText(this,"Welcome",Toast.LENGTH_LONG)

    }
}
