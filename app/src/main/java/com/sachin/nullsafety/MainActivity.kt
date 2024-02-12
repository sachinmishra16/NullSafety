package com.sachin.nullsafety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var name:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       name="sachin"

        //Safe Call(?.)
        // it returns value if its not null else return null

        Log.d("length_SafeCall","${name?.length}")

        //Safe Call with let (?.let)
        // if value is null, let part will not execute

        name?.let {
            Log.d("length_SafeCallwithlet","${name!!.length}")

        }

        //Elvis operator (?:)
        //behave like a ternary operator
       /*val length= if (name!=null)
                   name!!.length
                      else
                     -1*/

        //same work done by elvis operator

        var length=name?.length?:-1
        var myname:String?=null
        var mynamedata=myname?:-1

        Log.d("length_ElvisOperator","${length}-- $mynamedata")


        // Non null assertion operator(!!)
        // it throws null pointer exception , it value is null

        Log.d("length_NonNullAssertion","${name!!.length}")

    }
}