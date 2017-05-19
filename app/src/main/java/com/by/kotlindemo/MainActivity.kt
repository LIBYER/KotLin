package com.by.kotlindemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_text.text = "木子饼干"

        main_button.setOnClickListener {
            val intent =Intent(this,RecyclerViewActivity::class.java)
            startActivity(intent)
        }



    }


}



