@file:JvmName("Constants")

package com.example.android.camera2basic

import java.text.DateFormat
import java.text.Format
import java.text.SimpleDateFormat
import java.util.*

val form=SimpleDateFormat("yyyyMMddHHmmss")
val data=Date(System.currentTimeMillis())

val REQUEST_CAMERA_PERMISSION = 1
val PIC_FILE_NAME = "${form.format(data)}.jpg"
