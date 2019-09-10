package com.mufc.petkaglava

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Viewa.setOnClickListener{
            val random= Random
            val k =random.nextInt(2)


            if( k==0){
                Viewa.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext, // Context
                        R.drawable.glava // Drawable
                    )
                )

            }
            else{
                Viewa.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext, // Context
                        R.drawable.petka ))         }
        }
    }
}
