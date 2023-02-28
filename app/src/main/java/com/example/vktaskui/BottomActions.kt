package com.example.vktaskui

import android.content.Context
import androidx.appcompat.app.AlertDialog
import de.hdodenhof.circleimageview.CircleImageView

object BottomActions {
    var cameraFlag = true
    var micFlag = false

    fun cameraSwitch(camera: CircleImageView){
            if (cameraFlag){
                camera.setImageResource(R.drawable.videocam)
                cameraFlag = false
            } else {
                camera.setImageResource(R.drawable.videocam_off)
                cameraFlag = true
            }
    }

    fun micSwitch(mic: CircleImageView){
        if (micFlag){
            mic.setImageResource(R.drawable.mic)
            micFlag = false
        } else {
            mic.setImageResource(R.drawable.mic_off)
            micFlag = true
        }
    }

    fun handAction(context: Context){
        val builder = AlertDialog.Builder(context)
        builder.setMessage("Привет")
        builder.show()
    }
}