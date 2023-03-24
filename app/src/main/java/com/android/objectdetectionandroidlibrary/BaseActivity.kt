package com.android.objectdetectionandroidlibrary

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/**
 * Base Activity for the application
 */
class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.base_activity)
        val btn_object_detection = findViewById<Button>(R.id.btn_object_detection)
        btn_object_detection.setOnClickListener {
            val intent = Intent(this, ObjectDetectionActivity::class.java)
            startActivity(intent)
        }
    }
}
