package com.apps.githubbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("This is master commit") // Master Branch
        print("this is chatFeature commit") // ChatFeature Branch
        print("this is second chatFeature commit") // ChatFeature Branch
        print("this is second master commit") // Master Branch
        print("this is upload feature commit")//UploadFeature Branch

        print("this is third chatFeature commit") // ChatFeature Branch
    }
}