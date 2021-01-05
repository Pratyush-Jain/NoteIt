package com.example.noteit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar1)
        floatingActionButton.setOnClickListener {
            var bs= bottomSheetDialog()
            bs.show(supportFragmentManager,"bottom Sheet")
        }
    }

    fun showTimePickerDialog(v: View) {
        TimePickerFragment().show(supportFragmentManager, "timePicker")
}
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId ) {
            R.id.app_bar_search->
            {
                Toast.makeText(this,"Search",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.app_bar_delete->
            {
                Toast.makeText(this,"Delete",Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }


    }

}