package com.apps.githubbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("This is master commit") // Master Branch
        print("this is chatFeature commit") // ChatFeature Branch
    }
}