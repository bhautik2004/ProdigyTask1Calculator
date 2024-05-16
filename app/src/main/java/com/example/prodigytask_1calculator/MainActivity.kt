package com.example.prodigytask_1calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var operator = ""
        var secondno=""
        var firstno = ""
        one.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+"1")
            if (operator != ""){
                secondno+="1"
            }
            else{
                firstno+="1"
            }

        }
        two.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+"2")
            if (operator != ""){
                secondno+="2"
            }
            else{
                firstno+="2"
            }
        }
        three.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+"3")
            if (operator != ""){
                secondno+="3"
            }
            else{
                firstno+="3"
            }
        }
        four.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+"4")

            if (operator != ""){
                secondno+="4"
            }
            else{
                firstno+="4"
            }
        }
        five.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+"5")
            if (operator != ""){
                secondno+="5"
            }
            else{
                firstno+="5"
            }
        }
        six.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+"6")
            if (operator != ""){
                secondno+="6"
            }
            else{
                firstno+="6"
            }
        }
        seven.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+"7")
            if (operator != ""){
                secondno+="7"
            }
            else{
                firstno+="7"
            }
        }

        eight.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+"8")
            if (operator != ""){
                secondno+="8"
            }
            else{
                firstno+="8"
            }
        }
        nine.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+"9")
            if (operator != ""){
                secondno+="9"
            }
            else{
                firstno+="9"
            }
        }
        zero.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+"0")
            if (operator != ""){
                secondno+="0"
            }
            else{
                firstno+="0"
            }
        }
        plus.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+"+")
            operator="+"
        }
        minus.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+"-")
            operator="-"
        }
        divide.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+"/")
            operator="/"
        }
        multiply.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+"*")
            operator="*"
        }
        dot.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+".")
            if (operator != ""){
                secondno+="."
            }
            else{
                firstno+="."
            }
        }
        pr.setOnClickListener {
            var i = input.text
            input.setText(i.toString()+"%")
            operator="%"
        }
        back.setOnClickListener {
            var i = input.text
            if (i.length>0){
                i=i.substring(0,i.length-1)
                input.setText(i.toString())
            }
        }
        ac.setOnClickListener {
            input.setText("")
            ans.setText("0")
            firstno=""
            secondno=""
            operator=""
        }
        equal.setOnClickListener {
            when(operator){
                "+"->{
                   var result= firstno.toInt()+secondno.toInt()
                    ans.setText(result.toString())
                }
                "-"->{
                    var result= firstno.toInt()-secondno.toInt()
                    ans.setText(result.toString())
                }
                "/"->{
                    var result:Double=firstno.toDouble()/secondno.toDouble()
                    ans.setText(result.toString())
                }
                "*"->{
                    var result= firstno.toInt()*secondno.toInt()
                    ans.setText(result.toString())
                }
                "%"->{
                    var result= firstno.toInt()%secondno.toInt()
                    ans.setText(result.toString())
                }

            }
        }
    }
}