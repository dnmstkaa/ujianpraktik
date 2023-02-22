package com.example.dinaujiana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val biodata = findViewById<Button>(R.id.biodata)
        val pendidikan = findViewById<Button>(R.id.pendidikan)
        val portofolio = findViewById<Button>(R.id.portofolio)

        biodata.setOnClickListener {
            val intent = Intent(this, profil1::class.java)
            startActivity(intent)
            pendidikan.setOnClickListener {
                val intent = Intent(this, riwayatpendidikan1::class.java)
                startActivity(intent)
                portofolio.setOnClickListener {
                    val intent = Intent(this, portofolio1::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}