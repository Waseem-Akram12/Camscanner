package com.example.camscanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.camscanner.Adapter.AdapterRecentDocuments

class MainActivity : AppCompatActivity() {
    lateinit var adapterRecentDocuments: AdapterRecentDocuments
    private lateinit var recyclerView: RecyclerView
    val imageResources = listOf(R.drawable.documetsimage, R.drawable.documetsimage, R.drawable.documetsimage, R.drawable.documetsimage, R.drawable.documetsimage, R.drawable.documetsimage)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView= findViewById(R.id.recyclerview1)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        adapterRecentDocuments = AdapterRecentDocuments(imageResources)
        recyclerView.adapter = adapterRecentDocuments
    }
}