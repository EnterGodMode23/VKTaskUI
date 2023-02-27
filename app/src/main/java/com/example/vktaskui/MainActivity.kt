package com.example.vktaskui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.core.content.ContextCompat
import com.example.vktaskui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val buttonCamera = binding.camera
        var cameraFlag = true
        buttonCamera.setOnClickListener {
            if (cameraFlag){
                buttonCamera.setImageResource(R.drawable.videocam)
                cameraFlag = false
            } else {
                buttonCamera.setImageResource(R.drawable.videocam_off)
                cameraFlag = true
            }
        }
    }
}