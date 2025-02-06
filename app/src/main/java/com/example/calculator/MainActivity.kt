package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.calculator.R

class MainActivity : AppCompatActivity() , View.OnClickListener{

    //declare variables for buttons, edit text and text view
    private lateinit var Additionbutton : Button
    private lateinit var Subtractionbutton : Button
    private lateinit var Multiplicationbutton : Button
    private lateinit var Divisionbutton : Button
    private lateinit var Firstvalue : EditText
    private lateinit var Secondvalue : EditText
    private lateinit var Answertext : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //assign variables to their respective ids
        Additionbutton = findViewById(R.id.Addition_button)
        Subtractionbutton = findViewById(R.id.Subtraction_button)
        Multiplicationbutton = findViewById(R.id.Multiplication_button)
        Divisionbutton = findViewById(R.id.Division_button)

        Firstvalue = findViewById(R.id.First_value)
        Secondvalue = findViewById(R.id.Second_value)
        Answertext = findViewById(R.id.Answer)

        //set on click listeners for buttons
        Additionbutton.setOnClickListener(this)
        Subtractionbutton.setOnClickListener(this)
        Multiplicationbutton.setOnClickListener(this)
        Divisionbutton.setOnClickListener(this)

    }

    override fun onClick(v: View?){
        var FirstValue = Firstvalue.text.toString().toDouble()
        var SecondValue = Secondvalue.text.toString().toDouble()
        var AnswerValue = 0.0

        //switch statement to determine which button was pressed
        when(v?.id){
            R.id.Addition_button -> {
                AnswerValue = FirstValue+SecondValue
            }
            R.id.Subtraction_button -> {
                AnswerValue = FirstValue-SecondValue
            }
            R.id.Multiplication_button -> {
                AnswerValue = FirstValue*SecondValue
            }
            R.id.Division_button -> {
                AnswerValue = FirstValue/SecondValue
            }
        }
        //display answer
        Answertext.text = "Answer is $AnswerValue"
    }
}