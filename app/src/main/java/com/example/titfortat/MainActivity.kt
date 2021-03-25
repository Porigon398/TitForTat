package com.example.titfortat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * メイン画面.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        confessButton.setOnClickListener {
            val intent = Intent(application, ResultActivity::class.java)
            startActivity(intent)
        }

        silenceButton.setOnClickListener {
            val intent = Intent(application, ResultActivity::class.java)
            startActivity(intent)
        }
    }
}