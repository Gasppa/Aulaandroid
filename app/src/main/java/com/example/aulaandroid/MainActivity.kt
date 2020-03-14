package com.example.aulaandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txt1 = findViewById<EditText>(R.id.editText)
        var txt2 = findViewById<EditText>(R.id.editText2)

        val b1 = findViewById<Button>(R.id.button1)
        val b2 = findViewById<Button>(R.id.button2)
        val b3 = findViewById<Button>(R.id.button3)
        val b4 = findViewById<Button>(R.id.button4)

        val myClick = View.OnClickListener { view ->

            var a = 0
            var b = 0
            var res = 0

            when(view.getId()){
                R.id.button1 -> {
                    a = txt1.text.toString().toInt()
                    b = txt2.text.toString().toInt()
                    res = a + b

                    Toast.makeText(this, res.toString(), Toast.LENGTH_LONG).show()
                }

                R.id.button2 -> {
                    a = txt1.text.toString().toInt()
                    b = txt2.text.toString().toInt()
                    res = a - b

                    Toast.makeText(this, res.toString(), Toast.LENGTH_LONG).show()
                }

                R.id.button3 -> {
                    a = txt1.text.toString().toInt()
                    b = txt2.text.toString().toInt()
                    res = a * b

                    Toast.makeText(this, res.toString(), Toast.LENGTH_LONG).show()
                }

                R.id.button4 -> {
                    a = txt1.text.toString().toInt()
                    b = txt2.text.toString().toInt()
                    res = a / b

                    Toast.makeText(this, res.toString(), Toast.LENGTH_LONG).show()
                }

            }

        }

        b1.setOnClickListener(myClick)
        b2.setOnClickListener(myClick)
        b3.setOnClickListener(myClick)
        b4.setOnClickListener(myClick)



    }
}
