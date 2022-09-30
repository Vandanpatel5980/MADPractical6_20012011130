package com.example.madpractical6_20012011130

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    private val youtubeId = "5SIBB589fAg"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val mywebview = findViewById<WebView>(R.id.web1)
        val settings =mywebview.settings
        settings.javaScriptEnabled = true
        settings.loadWithOverviewMode
        settings.useWideViewPort = true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeId")
        val button =findViewById<FloatingActionButton>(R.id.button2)
        button.setOnClickListener{
            Intent(this,MainActivity::class.java).apply{
                startActivity(this)
            }
        }
    }
}