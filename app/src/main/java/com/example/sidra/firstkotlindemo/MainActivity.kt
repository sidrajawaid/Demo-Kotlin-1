package com.example.sidra.firstkotlindemo

import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        id1.text="Hi hello how r"
        //toast(message = "Hello", length = Toast.LENGTH_SHORT)
    }
    fun mymesage(name:String, age:Int)
    {

    }

}
