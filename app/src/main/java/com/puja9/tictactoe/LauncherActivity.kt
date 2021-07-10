package com.puja9.tictactoe


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_launcher.*


class LauncherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)
    }

    fun secondActivity(view: View) {
        val intent = Intent(applicationContext, MainActivity::class.java)
        intent.putExtra("input", inputName.text.toString())
        startActivity(intent)
    }


}