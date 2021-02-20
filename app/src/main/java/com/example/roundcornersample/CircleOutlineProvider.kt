package com.example.roundcornersample

import android.graphics.Outline
import android.view.View
import android.view.ViewOutlineProvider

class CircleOutlineProvider : ViewOutlineProvider() {

    override fun getOutline(view: View, outline: Outline) {
        outline.setRoundRect(0,0, view.width, view.height, view.height.toFloat() / 2.0f)
        view.clipToOutline = true
    }

}