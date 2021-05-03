package com.ronak.allsethome

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class Splash_screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val ig_sp_logo = findViewById<ImageView>(R.id.ig_sp_logo)

        Timer().schedule(object : TimerTask() {
            override fun run() {

                continue_to_app()
//                if (SessionManager.isLogin) {
//                    continue_to_app()
//                } else {
//                    //login_to_app()
//                }
            }
        }, 2000)

        ig_sp_logo.startAnimation(AnimationUtils.loadAnimation(this,R.anim.move))
    }

    private fun continue_to_app() {
        val intent = Intent(this, MainActivity::class.java) //not application context
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }

//    private fun login_to_app() {
//
//        val intent = Intent(this, Login::class.java)
//        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
//        startActivity(intent)
//    }
}