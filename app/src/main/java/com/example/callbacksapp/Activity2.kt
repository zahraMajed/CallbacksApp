package com.example.callbacksapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    val Tag="Activity 2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        showToast(this,"onCreate Activity 2")
        Log.d(Tag, "onCreate: ")
    }

    fun showToast (context: Context, msg:String){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        showToast(this, "onStart Activity 2")
        Log.d(Tag,"onStart:")
    }//end onStart()

    override fun onResume() {
        super.onResume()
        showToast(this, "onResume Activity 2")
        Log.d(Tag,"onResume:")
    }//end onResume()

    override fun onPause() {
        super.onPause()
        showToast(this, "onPause Activity 2")
        Log.d(Tag,"onPause:")
    }//end onPause()

    override fun onStop() {
        super.onStop()
        showToast(this, "onStop Activity 2")
        Log.d(Tag,"onStop:")
    }//end onStop()

    override fun onDestroy() {
        super.onDestroy()
        showToast(this, "onDestroy Activity 2")
        Log.d(Tag,"onDestroy:")
    }//end onDestroy()
}