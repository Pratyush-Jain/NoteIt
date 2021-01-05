package com.example.noteit

import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.text.format.DateFormat
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.TimePicker
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.layout_persistent_bottom_sheet.*
import java.util.*

class TimePickerFragment: DialogFragment(), TimePickerDialog.OnTimeSetListener {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Use the current time as the default values for the picker
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        // Create a new instance of TimePickerDialog and return it
        return TimePickerDialog(activity, this, hour, minute, DateFormat.is24HourFormat(activity))
    }

    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
        time_btn!!.text = "Hello World"
    //Toast.makeText(this.context,"$hourOfDay",Toast.LENGTH_SHORT).show()

    }
}
