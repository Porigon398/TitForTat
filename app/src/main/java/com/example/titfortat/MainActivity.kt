package com.example.titfortat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * メイン画面.
 */
class MainActivity : AppCompatActivity() {
    /** 尋問に答えた回数 */
    private var mAnswerCount = 0
    /** 尋問に答えさせる回数 */
    private val MAX_ANSWER_COUNT = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        confessButton.setOnClickListener {
            mAnswerCount++
            if(mAnswerCount >= MAX_ANSWER_COUNT) {
                val intent = Intent(application, ResultActivity::class.java)
                startActivity(intent)
            }
        }

        silenceButton.setOnClickListener {
            mAnswerCount++
            if(mAnswerCount >= MAX_ANSWER_COUNT) {
                val intent = Intent(application, ResultActivity::class.java)
                startActivity(intent)
            }
        }
    }
}