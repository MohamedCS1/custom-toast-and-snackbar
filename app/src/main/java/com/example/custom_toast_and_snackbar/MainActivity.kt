package com.example.custom_toast_and_snackbar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import java.util.*

class MainActivity : AppCompatActivity() {

    var bustart:Button? = null
    var snackbar:Snackbar? = null

    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bustart = findViewById(R.id.bu_start)

        bustart!!.setOnClickListener {

            snackbar = Snackbar.make(bustart!!,"this is snackbar" ,Snackbar.LENGTH_SHORT)

            snackbar!!.show()

            snackbar!!.setAction("Show Toast" ,object :View.OnClickListener
            {
                override fun onClick(v: View?) {

                    val toast = Toast(this@MainActivity)

                    toast.view = View.inflate(this@MainActivity ,R.layout.custom_toast ,null)

                    toast.show()
                }

            })
        }

    }
}