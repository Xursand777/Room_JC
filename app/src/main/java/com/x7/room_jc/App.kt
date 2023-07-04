package com.x7.room_jc

import android.app.Application
import com.x7.room_jc.data.MainDb

class App : Application() {
    val database by lazy { MainDb.createDatBase(this) }
}