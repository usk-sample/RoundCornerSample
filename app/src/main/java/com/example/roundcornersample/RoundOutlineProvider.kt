package com.example.roundcornersample

import android.content.Context
import android.graphics.Outline
import android.view.View
import android.view.ViewOutlineProvider

class RoundOutlineProvider : ViewOutlineProvider() {

    private val cornerRadius: Float = 8.0f

    override fun getOutline(view: View, outline: Outline) {
        val margin = dp2Px(cornerRadius, view.context).toInt()
        outline.setRoundRect(
            margin, margin, (view.width - margin), (view.height - margin),
            dp2Px(30f, view.context)
        )
        view.clipToOutline = true
    }

    private fun dp2Px(dp: Float, context: Context): Float {
        val metrics = context.resources.displayMetrics
        return dp * metrics.density
    }

}