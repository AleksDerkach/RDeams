package com.example.task_10

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        val btn:Button = findViewById(R.id.button)
        btn.setOnClickListener(){
            Toast.makeText(this, "btn is pressed", Toast.LENGTH_SHORT).show()
        }
    }
}