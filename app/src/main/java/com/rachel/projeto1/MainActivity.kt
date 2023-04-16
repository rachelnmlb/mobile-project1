package com.rachel.projeto1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var alertButton: Button = findViewById(R.id.alert)

        var alert: AlertDialog = AlertDialog.Builder(this)
            .setPositiveButton(android.R.string.ok, null)
            .setMessage("Alerta")
            .create()

        alertButton.setOnClickListener { view ->
            alert.show()
        }
    }
}