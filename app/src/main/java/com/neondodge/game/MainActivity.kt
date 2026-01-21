package com.neondodge.game

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var player: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        player = findViewById(R.id.player)

        // Déplacement du joueur au toucher
        findViewById<View>(R.id.gameRoot).setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_MOVE ||
                event.action == MotionEvent.ACTION_DOWN) {

                player.x = event.x - player.width / 2
                player.y = event.y - player.height / 2
            }
            true
        }
    }
}
