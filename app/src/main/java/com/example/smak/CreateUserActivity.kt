package com.example.smak

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : AppCompatActivity() {
    var userAvater="profiledefault"
    var backgroundcolor="[0.5,0.5,0.5,1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }
    fun CreateAvaterPic (view: View){
        val random = Random()
        val color=random.nextInt(2)
        val avater=random.nextInt(28)
        if (color==0){
            userAvater="light$avater"
        }else{
            userAvater="dark$avater"
        }
        val resoursed=resources.getIdentifier(userAvater,"drawable",packageName)
        avaterPic.setImageResource(resoursed)




    }
    fun generateBackgroundColor (view: View){
        val random=Random()
        val r=random.nextInt(255)
        val b=random.nextInt(255)
        val g=random.nextInt(255)
        avaterPic.setBackgroundColor(Color.rgb(r,g,b))
        val savedR=r.toDouble() /255
        val savedB=r.toDouble() /255
        val savedG=r.toDouble() /255
        backgroundcolor="[$savedR,$savedG,$savedB,1]"





    }
    fun createNewAcount (view: View){

    }
}
