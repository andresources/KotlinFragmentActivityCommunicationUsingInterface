package com.kotlinfragmentcommunication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.kotlinfragmentcommunication.R

class MainActivity : AppCompatActivity(),ShowDataInterface {
    private lateinit var tvActivityTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvActivityTextView = findViewById(R.id.tvActivityTextView)
        val loginFragment = FirstFragment()
        supportFragmentManager.beginTransaction().apply {
            add(R.id.fragment_container_view, loginFragment)
            commit()
        }
    }

    override fun showData(show: String) {
        tvActivityTextView.text = show
    }
}