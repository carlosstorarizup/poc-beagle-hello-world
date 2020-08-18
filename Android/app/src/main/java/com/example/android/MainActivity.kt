package com.example.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import br.com.zup.beagle.android.utils.loadView
import br.com.zup.beagle.android.view.ScreenRequest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val frameLayout = findViewById<FrameLayout>(R.id.fr_server_driven)
        /*/serverDrivenComponent*/
        frameLayout.loadView(this, ScreenRequest("/intro"))
    }
}