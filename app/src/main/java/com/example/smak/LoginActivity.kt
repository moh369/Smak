package com.example.smak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginBTN(view: View){

    }
    fun loginBtnClick (view: View){

    }
    fun sinUpBtn (view: View){
        val createAcountActivity=Intent(this,CreateUserActivity::class.java)
        startActivity(createAcountActivity)
    }
}
