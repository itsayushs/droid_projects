package com.tensor.randoms

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodlist= arrayListOf("Egg Omelet","Chole Kulche", "Veg Roll", "Maggii Soup")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideBtn.setOnClickListener {
            val random= Random()
            val randomint=random.nextInt(foodlist.count())
            selectedFood.text=foodlist[randomint]
        }
        addfoodBtn.setOnClickListener {
            val newitem=optionTxt.text.toString()
            foodlist.add(newitem)
            optionTxt.text.clear()
        }
    }
}
