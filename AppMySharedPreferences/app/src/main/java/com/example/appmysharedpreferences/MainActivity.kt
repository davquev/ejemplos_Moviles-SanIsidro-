package com.example.appmysharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = SharedPreferences(this)

        btnSave.setOnClickListener {
            val name = etName.text.toString()
            sharedPreferences.save("name", name)

            Toast.makeText(this, "Data stored!!!", Toast.LENGTH_LONG).show()
        }

        btnRetrieve.setOnClickListener {
            if (sharedPreferences.getValueString("name") != null){
                tvRetrieve.setText(sharedPreferences.getValueString("name"))
            }
        }
    }
}