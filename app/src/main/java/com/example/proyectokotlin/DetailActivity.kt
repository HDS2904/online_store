package com.example.proyectokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_descr.*
import kotlinx.android.synthetic.main.item_loading.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        intent?.extras?.let {
            val t1 = intent.extras!!["title"]
            tvDetailTitulo.text = t1.toString()
            val t2 = intent.extras!!["desc"]
            tvDetailDesc.text = t2.toString()
            val t3 = intent.extras!!["price"]
            tvDetailPrice.text =  "$ $t3"
        }
    }
}
