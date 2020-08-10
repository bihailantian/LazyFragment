package com.example.lazyfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG,ContentFragment::class.java.simpleName)
        supportFragmentManager.beginTransaction()
            .add(R.id.fl_content,ContentFragment.newInstance("",""),ContentFragment::class.java.simpleName)
            .commit()

    }

    companion object {
        private const  val TAG :String = "MainActivity"
    }
}
