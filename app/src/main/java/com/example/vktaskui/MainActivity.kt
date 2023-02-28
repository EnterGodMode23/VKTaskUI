package com.example.vktaskui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.vktaskui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val buttonCamera = binding.camera
        val buttonMic = binding.bottomMic
        val buttonHand = binding.hand
        val buttonEndCall = binding.endCall
        buttonCamera.setOnClickListener{
            BottomActions.cameraSwitch(buttonCamera)
        }
        buttonMic.setOnClickListener{
            BottomActions.micSwitch(buttonMic)
        }
        buttonHand.setOnClickListener{
            BottomActions.handAction(this)
        }
        buttonEndCall.setOnClickListener {
            finish()
        }
    }
}