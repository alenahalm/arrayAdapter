package com.example.arrayadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var first: Array<String>
    lateinit var last: Array<String>
    var arr = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        first = resources.getStringArray(R.array.first_names)
        last = resources.getStringArray(R.array.last_names)

//        val arr = Array<String>(5){""}
//        val arr = mutableListOf<String>()
        for (i in 0 until 5) {
            val f = Random.nextInt(first.size)
            val l = Random.nextInt(last.size)
            arr.add(first[f] + " " + last[l])
        }

        val listView: ListView = findViewById(R.id.ListView)
        listView.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            arr
        )
    }

    fun onClick(v: View) {
        val f = Random.nextInt(first.size)
        val l = Random.nextInt(last.size)
        arr.add(first[f] + " " + last[l])
        val listView: ListView = findViewById(R.id.ListView)
        listView.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            arr
        )
    }
}