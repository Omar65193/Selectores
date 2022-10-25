package com.example.selectores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun showTimePickerDialog(v: View) {
        val timePicker = TimePickerFragment {ontTimeSelected(it)}
        timePicker.show(supportFragmentManager, "timePicker")

    }
    fun ontTimeSelected(time:String){
        val txt_hr = findViewById<TextView>(R.id.txt_hr)
        txt_hr.setText(time)
    }

    fun ontDateSelected(date:String){
        val txt_dt = findViewById<TextView>(R.id.txt_dt)
        txt_dt.setText(date)
    }
    fun showDatePickerDialog(v: View) {
        val datePicker = DatePickerFragment {ontDateSelected(it)}
        datePicker.show(supportFragmentManager, "datePicker")
    }

}