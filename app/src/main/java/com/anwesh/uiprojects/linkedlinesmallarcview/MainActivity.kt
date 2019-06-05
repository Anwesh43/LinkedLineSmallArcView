package com.anwesh.uiprojects.linkedlinesmallarcview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.linesmallarcview.LineSmallArcView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LineSmallArcView.create(this)
    }
}
