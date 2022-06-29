package com.example.calculator

import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{
    var num1: Float? = 0.0F
    var num2: Float? = 0.0F
    var show:Boolean = false
    var float = false
    var sign: Int = 0
    lateinit var button: View
    lateinit var button2: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        point.setOnClickListener(this)
        one.setOnClickListener(this)
        two.setOnClickListener(this)
        three.setOnClickListener(this)
        four.setOnClickListener(this)
        five.setOnClickListener(this)
        six.setOnClickListener(this)
        seven.setOnClickListener(this)
        eight.setOnClickListener(this)
        nine.setOnClickListener(this)
        zero.setOnClickListener(this)
        c.setOnClickListener(this)
        plusminus.setOnClickListener(this)
        perc.setOnClickListener(this)
        division.setOnClickListener(this)
        mult.setOnClickListener(this)
        minus.setOnClickListener(this)
        plus.setOnClickListener(this)
        equasion.setOnClickListener(this)
        backspace.setOnClickListener(this)
        button = findViewById(R.id.dm)
        button2 = findViewById(R.id.backg)


        val appSettingPrefs: SharedPreferences = getSharedPreferences("AppSettingPrefs", 0)
        val sharedPrefsEdit: SharedPreferences.Editor = appSettingPrefs.edit()
        val isNightModeOn: Boolean = appSettingPrefs.getBoolean("NightMode", false)

        if (isNightModeOn){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            backg.setImageResource(R.drawable.darkmode)
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            backg.setImageResource(R.drawable.lightmode)
        }

        button.setOnClickListener(
                {
                    if (isNightModeOn){
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                        sharedPrefsEdit.putBoolean("NightMode", false)
                        sharedPrefsEdit.apply()

                        backg.setImageResource(R.drawable.darkmode)
                    }else{
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                        sharedPrefsEdit.putBoolean("NightMode", true)
                        sharedPrefsEdit.apply()

                        backg.setImageResource(R.drawable.lightmode)
                    }
                }
        )

        button2.setOnClickListener(
                {
                    if (isNightModeOn){
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                        sharedPrefsEdit.putBoolean("NightMode", false)
                        sharedPrefsEdit.apply()

                        backg.setImageResource(R.drawable.darkmode)
                    }else{
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                        sharedPrefsEdit.putBoolean("NightMode", true)
                        sharedPrefsEdit.apply()

                        backg.setImageResource(R.drawable.lightmode)
                    }
                }
        )


    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        if (main.text.toString().contains(".")){
            float = true
        }else{
            float = false
        }
        if (show){
            textView3.setText("")
        }
        var text: String? = ""
        var id = v?.id
        when (id) {
            R.id.one -> {
                if (show){
                    main.setText("0")
                    show = false
                }
                if (main.text.toString() == "0"){
                    text = ""
                    main.setText("")
                }
                text = main.text.toString() + "1"
                main.setText(text.toString())
            }
            R.id.two -> {
                if (show){
                    main.setText("0")
                    show = false
                }
                if (main.text.toString() == "0"){
                    text = ""
                    main.setText("")
                }
                text = main.text.toString() + "2"
                main.setText(text.toString())
            }
            R.id.three -> {
                if (show){
                    main.setText("0")
                    show = false
                }
                if (main.text.toString() == "0"){
                    text = ""
                    main.setText("")
                }
                text = main.text.toString() + "3"
                main.setText(text.toString())
            }
            R.id.four -> {
                if (show){
                    main.setText("0")
                    show = false
                }
                if (main.text.toString() == "0"){
                    text = ""
                    main.setText("")
                }
                text = main.text.toString() + "4"
                main.setText(text.toString())
            }
            R.id.five -> {
                if (show){
                    main.setText("0")
                    show = false
                }
                if (main.text.toString() == "0"){
                    text = ""
                    main.setText("")
                }
                text = main.text.toString() + "5"
                main.setText(text.toString())
            }
            R.id.six -> {
                if (show){
                    main.setText("0")
                    show = false
                }
                if (main.text.toString() == "0"){
                    text = ""
                    main.setText("")
                }
                text = main.text.toString() + "6"
                main.setText(text.toString())
            }
            R.id.seven -> {
                if (show){
                    main.setText("0")
                    show = false
                }
                if (main.text.toString() == "0"){
                    text = ""
                    main.setText("")
                }
                text = main.text.toString() + "7"
                main.setText(text.toString())
            }
            R.id.eight -> {
                if (show){
                    main.setText("0")
                    show = false
                }
                if (main.text.toString() == "0"){
                    text = ""
                    main.setText("")
                }
                text = main.text.toString() + "8"
                main.setText(text.toString())
            }
            R.id.nine -> {
                if (show){
                    main.setText("0")
                    show = false
                }
                if (main.text.toString() == "0"){
                    text = ""
                    main.setText("")
                }
                text = main.text.toString() + "9"
                main.setText(text.toString())
            }
            R.id.zero -> {
                if (show){
                    main.setText("0")
                    show = false
                }
                if (main.text.toString() == "0"){
                    main.setText("0")
                }else{
                text = main.text.toString() + "0"
                main.setText(text.toString())
                }
            }
            R.id.c -> {
                text = ""
                textView3.setText("")
                num1 = 0.0F
                num2 = 0.0F
                main.setText("0")
                process.setText("0")
            }
            R.id.plusminus -> {
                var text = (main.text.toString().toFloat() * -1).toString()
                main.setText(text)
            }
            R.id.perc -> {
                text = (main.text.toString().toFloat() / 100).toString()
                main.setText(text)
            }
            R.id.division -> {
                if (sign == 1){
                    num2 = main.text.toString().toFloat()
                    var answer = (num1?.div(num2!!))?.toFloat().toString()
                    process.setText(answer)
                    main.setText("0")
                    text = ""
                    num1 = answer!!.toFloat()
                    sign = 1
                }else if (sign == 2){
                    main.setText("0")
                    text = ""
                    num2 = main.text.toString().toFloat()
                    var answer = num1!!.toFloat() * num2!!.toFloat()
                    process.setText(answer.toString())
                    num1 = answer
                    sign = 1
                }else if (sign == 3){
                    main.setText("0")
                    text = ""
                    num2 = main.text.toString().toFloat()
                    var answer = num1!!.toFloat() - num2!!.toFloat()
                    process.setText(answer.toString())
                    num1 = answer
                    sign = 1
                }else if (sign == 4){
                    main.setText("0")
                    text = ""
                    num2 = main.text.toString().toFloat()
                    var answer = num1!!.toFloat() + num2!!.toFloat()
                    process.setText(answer.toString())
                    num1 = answer
                    sign = 1
                }else{
                    num1 = main.text.toString().toFloat()
                    sign = 1
                    text = ""
                    main.setText("0")
                    process.setText(num1.toString())
                    textView3.setText("/")
                }
            }
            R.id.mult -> {
                if (sign == 1){
                    num2 = main.text.toString().toFloat()
                    text = (num1?.toFloat()?.div(num2!!.toFloat())).toString()
                    process.setText(text)
                    num1 = text.toFloat()
                    main.setText("0")
                    text = ""
                    sign = 2
                }else if (sign == 2){
                    num2 = main.text.toString().toFloat()
                    var answer = num1!!.toFloat() * num2!!.toFloat()
                    process.setText(answer.toString())
                    num1 = answer
                    main.setText("0")
                    text = ""
                    sign = 2
                }else if (sign == 3){
                    num2 = main.text.toString().toFloat()
                    var answer = num1!!.toFloat() - num2!!.toFloat()
                    process.setText(answer.toString())
                    num1 = answer
                    main.setText("0")
                    text = ""
                    sign = 2
                }else if (sign == 4){
                    num2 = main.text.toString().toFloat()
                    var answer = num1!!.toFloat() + num2!!.toFloat()
                    process.setText(answer.toString())
                    num1 = answer
                    sign = 2
                    main.setText("0")
                    text = ""
                }else{
                    num1 = main.text.toString().toFloat()
                    sign = 2
                    main.setText("0")
                    process.setText(num1.toString())
                    textView3.setText("x")
                    text = ""
                }
            }
            R.id.minus -> {
                if (sign == 1){
                    num2 = main.text.toString().toFloat()
                    text = (num1?.toFloat()?.div(num2!!.toFloat())).toString()
                    process.setText(text)
                    num1 = text.toFloat()
                    sign = 3
                    main.setText("0")
                    text = ""
                }else if (sign == 2){
                    num2 = main.text.toString().toFloat()
                    var answer = num1!!.toFloat() * num2!!.toFloat()
                    process.setText(answer.toString())
                    num1 = answer
                    sign = 3
                    main.setText("0")
                    text = ""
                }else if (sign == 3){
                    num2 = main.text.toString().toFloat()
                    var answer = num1!!.toFloat() - num2!!.toFloat()
                    process.setText(answer.toString())
                    num1 = answer
                    sign = 3
                    main.setText("0")
                    text = ""
                }else if (sign == 4){
                    num2 = main.text.toString().toFloat()
                    var answer = num1!!.toFloat() + num2!!.toFloat()
                    process.setText(answer.toString())
                    num1 = answer
                    sign = 3
                    main.setText("0")
                    text = ""
                }else{
                    num1 = main.text.toString().toFloat()
                    sign = 3
                    main.setText("0")
                    process.setText(num1.toString())
                    textView3.setText("-")
                    text = ""
                }
            }
            R.id.plus -> {
                text = main.text.toString()
                if (sign == 1){
                    num2 = main.text.toString().toFloat()
                    text = (num1?.toFloat()?.div(num2!!.toFloat())).toString()
                    process.setText(text)
                    num1 = text.toFloat()
                    sign = 4
                    main.setText("0")
                    text = ""
                }else if (sign == 2){
                    num2 = main.text.toString().toFloat()
                    var answer = num1!!.toFloat() * num2!!.toFloat()
                    process.setText(answer.toString())
                    num1 = answer
                    sign = 4
                    main.setText("0")
                    text = ""
                }else if (sign == 3){
                    num2 = main.text.toString().toFloat()
                    var answer = num1!!.toFloat() - num2!!.toFloat()
                    process.setText(answer.toString())
                    num1 = answer
                    sign = 4
                    main.setText("0")
                    text = ""
                }else if (sign == 4){
                    num2 = main.text.toString().toFloat()
                    var answer = num1!!.toFloat() + num2!!.toFloat()
                    process.setText(answer.toString())
                    num1 = answer
                    sign = 4
                    main.setText("0")
                    text = ""
                }else{
                    num1 = main.text.toString().toFloat()
                    sign = 4
                    main.setText("0")
                    process.setText(num1.toString())
                    textView3.setText("+")
                    text = ""
                }
            }
            R.id.point -> {
                if (float == false){
                    text = main.text.toString() + "."
                    main.setText(text)
                    float = true
                }
            }
            R.id.equasion -> {
                num2 = main.text.toString().toFloat()
                if (sign == 1){
                    var answer = num1?.div(num2!!)
                    process.setText("0")
                    main.setText(answer.toString())
                }else if (sign == 2){
                    var answer = num1!!.toFloat() * num2!!.toFloat()
                    process.setText("0")
                    main.setText(answer.toString())
                }else if (sign == 3){
                    var answer = num1!!.toFloat() - num2!!.toFloat()
                    process.setText("0")
                    main.setText(answer.toString())
                }else if (sign == 4){
                    var answer = num1!!.toFloat() + num2!!.toFloat()
                    process.setText("0")
                    main.setText(answer.toString())
                }
                textView3.setText("=")
                num1 = 0.0F
                num2 = 0.0F
                sign = 0
                show = true
            }
            R.id.backspace -> {
                text = ""
                if (main.text.toString().length == 1){
                    text = "0"
                    main.setText(text.toString())
                }
                else{
                    text = ""
                    for (i in 0 until main.text.toString().length - 1){
                        text += main.text.toString()[i]
                    }
                    main.setText(text.toString())
                }
            }
        }
    }
}