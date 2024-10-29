package com.example.tuan3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tuan3.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Liên kết TextView từ layout với mã
        val birthdayTextView: TextView = findViewById(R.id.textView)
        val nameTextView: TextView = findViewById(R.id.textView2)

        // Cập nhật văn bản (có thể lấy từ tài nguyên string)
        birthdayTextView.text = getString(R.string.birthday_txt)
        nameTextView.text = getString(R.string.name_txt)
    }
}
