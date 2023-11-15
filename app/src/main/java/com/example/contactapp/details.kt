package com.example.contactapp


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val id = intent.getIntExtra("id", 0)
        val name = intent.getStringExtra("name")
        val phoneNumber = intent.getStringExtra("phoneNumber")
        val email = intent.getStringExtra("email")

        val detailId = findViewById<TextView>(R.id.detailId)
        val detailName = findViewById<TextView>(R.id.detailName)
        val detailPhoneNumber = findViewById<TextView>(R.id.detailPhoneNumber)
        val detailEmail = findViewById<TextView>(R.id.detailEmail)

        detailId.text = "Id: $id"
        detailName.text = "Name: $name"
        detailPhoneNumber.text = "Phone Number: $phoneNumber"
        detailEmail.text = "Email: $email"
    }
}