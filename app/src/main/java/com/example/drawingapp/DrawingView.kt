package com.example.drawingapp

import android.content.Context
import android.graphics.Bitmap
import android.util.AttributeSet
import android.view.View
import java.nio.file.Path

class DrawingView(context: Context,attrs: AttributeSet) : View(context, attrs) {
    private var mDrawPath : CustomPath? = null
    private var mCanvasBitmap: Bitmap? = null
        internal inner class CustomPath(var color:Int,
                                        var brushThickness:Float) : android.graphics.Path(){

    }
}