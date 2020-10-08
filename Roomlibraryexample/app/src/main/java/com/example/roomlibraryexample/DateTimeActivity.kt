package com.example.roomlibraryexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.codetroopers.betterpickers.calendardatepicker.CalendarDatePickerDialogFragment
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import kotlinx.android.synthetic.main.activity_date_time.*
import java.util.*


class DateTimeActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener,
    TimePickerDialog.OnTimeSetListener {

    private var dateTime: String = ""
    private var date: String = ""
    private var time: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_time)

        val now = Calendar.getInstance()
        val dpd = DatePickerDialog.newInstance(
            this@DateTimeActivity,
            now.get(Calendar.YEAR), // Initial year selection
            now.get(Calendar.MONTH), // Initial month selection
            now.get(Calendar.DAY_OF_MONTH) // Inital day selection
        )

        var cdp = CalendarDatePickerDialogFragment()
        cdp.setThemeCustom(R.style.customDialogTheme)


        btn_show_picker.setOnClickListener {
            // If you're calling this from an AppCompatActivity
            cdp.show(supportFragmentManager, "datePickerDialog")
        }
    }

    override fun onTimeSet(view: TimePickerDialog?, hourOfDay: Int, minute: Int, second: Int) {
        time = "$hourOfDay:$minute"
        dateTime = "$date $time"
        tv_date_and_time.text = dateTime

        Log.d("datetime", "$date $time")
    }

    override fun onDateSet(view: DatePickerDialog?, year: Int, monthOfYear: Int, dayOfMonth: Int) {
        showTimePicker()
        var currentMonth = (monthOfYear + 1)
        date = "$year/$currentMonth/$dayOfMonth"

        Log.d("date", date)

    }


    private fun showTimePicker() {
        val timePicker = TimePickerDialog.newInstance(this@DateTimeActivity, 12, 60, 60, false)

        timePicker.show(supportFragmentManager, "timePickerDialog")
    }
}
