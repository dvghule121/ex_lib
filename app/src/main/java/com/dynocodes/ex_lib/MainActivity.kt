package com.dynocodes.ex_lib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dynocodes.ex_v1.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toaster().toast(this)
    }
}