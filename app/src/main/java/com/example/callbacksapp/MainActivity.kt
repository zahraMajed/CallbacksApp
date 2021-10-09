package com.example.callbacksapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.security.AccessControlContext

class MainActivity : AppCompatActivity() {
    lateinit var btn2ndActivity: Button
    val Tag="Activity1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast(this, "onCreate Activity 1")

        btn2ndActivity=findViewById(R.id.button)

        //Callbacks is a mechanism that allows an application to handle events through listeners interfaces
        /* Callbacks is the button.setOnClickListerner function that uses an interface in it
        to handle the onClick event*/

        btn2ndActivity.setOnClickListener( object: View.OnClickListener {

            override fun onClick(v: View?) {
                intent=Intent(this@MainActivity,Activity2::class.java)
                startActivity(intent)
            }//end onClick()

        }

        )//end setOnClickListener parameter

    }//end onCreate()

    fun showToast (context: Context, msg:String){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        showToast(this, "onStart Activity 1")
        Log.d(Tag,"onStart")
    }//end onStart()

    override fun onResume() {
        super.onResume()
        showToast(this, "onResume Activity 1")
        Log.d(Tag,"onResume")
    }//end onResume()

    override fun onPause() {
        super.onPause()
        showToast(this, "onPause Activity 1")
        Log.d(Tag,"onPause")
    }//end onPause()

    override fun onStop() {
        super.onStop()
        showToast(this, "onStop Activity 1")
        Log.d(Tag,"onStop")
    }//end onStop()

    override fun onDestroy() {
        super.onDestroy()
        showToast(this, "onDestroy Activity 1")
        Log.d(Tag,"onDestroy")
    }//end onDestroy()

}