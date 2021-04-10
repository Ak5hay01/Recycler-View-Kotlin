package com.akshayteli.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akshayteli.recyclerviewdemo.adapter.AndroidVersionRecyclerAdapter

class MainActivity : AppCompatActivity(), AndroidVersionRecyclerAdapter.OnItemClickListener {

    private lateinit var androidVersionAdapter: AndroidVersionRecyclerAdapter
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        androidVersionAdapter.submitList(data)
    }

    private fun initRecyclerView(){

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

         recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val topSpacingDecorator = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingDecorator)
            androidVersionAdapter = AndroidVersionRecyclerAdapter(this@MainActivity)
            adapter = androidVersionAdapter
        }
    }

    override fun onItemClick(position: Int) {
        Toast.makeText(this, DataSource.createDataSet().get(position).title + " Clicked", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onItemClick: " + DataSource.createDataSet().get(position).title)
    }

}