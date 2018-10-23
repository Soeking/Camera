package com.example.android.camera2basic

import android.app.Fragment
import java.text.SimpleDateFormat
import java.util.*

class button:Fragment(){
    val date= Date(System.currentTimeMillis())
    val form= SimpleDateFormat("yyyyMMddHHmmss")

    val PIC_FILE_NAME = "${com.example.android.camera2basic.form.format(data)}.jpg"

    
}