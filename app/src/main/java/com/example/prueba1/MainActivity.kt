package com.example.prueba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton : Button = findViewById<Button>(R.id.button)
        val myEditText : EditText = findViewById<EditText>(R.id.editText)
        val myTextView : TextView = findViewById<Button>(R.id.textView)

        var myString : String

        myButton.setOnClickListener {
            myString = myEditText.text.toString()

            if(myString == "Jose") {
                myTextView.text = "Bienvenido de nuevo, Jose"
            }
            else {
                myTextView.text = myString
            }
        }
    }
}


