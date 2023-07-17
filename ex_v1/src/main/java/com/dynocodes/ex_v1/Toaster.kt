package com.dynocodes.ex_v1

import android.content.Context
import android.widget.Toast

class Toaster {
    fun toast(context: Context){
        Toast.makeText(context, "hi", Toast.LENGTH_SHORT)
    }
}