package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Order.setOnClickListener{
            val idOfCheckedTea =rg_check.checkedRadioButtonId
            val tea = findViewById<RadioButton>(idOfCheckedTea)
            val fruits = cb_fruits.isChecked
            val bubble = cb_bubble.isChecked
            val malai = cb_Malai.isChecked

            val order = "Your order is complete ;) \n" +
                    "${tea.text} \n" +
                    if(fruits) "\n Fruits" else if (bubble) "\n Bubble " else "\n Malai"

            tv_final.text=order


        }


    }
}