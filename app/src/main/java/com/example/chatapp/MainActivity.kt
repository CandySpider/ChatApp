package com.example.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.chatapp.adapter.ItemAdapter
import com.example.chatapp.data.DataSource
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.google.firebase.ktx.app

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = DataSource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
        //DatabaseSetup
        FirebaseDatabase.getInstance("https://chatapp-eb025-default-rtdb.europe-west1.firebasedatabase.app")
        val database = Firebase.database
        val myRef = database.getReference("message")
        myRef.setValue("Hello, Worldqwdqwqq!")

    }
}