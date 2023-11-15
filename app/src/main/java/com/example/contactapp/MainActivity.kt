package com.example.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import android.widget.AdapterView
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf<ItemModel>(
            ItemModel(1, "Đặng Văn A", "0928234876", "a@gmail.com"),
            ItemModel(2, "Nguyễn Thị B", "0123456789", "b@gmail.com"),
            ItemModel(3, "Trần Văn C", "0231458876", "c@gmail.com"),
            ItemModel(4, "Lê Thị D", "0987864128", "d@gmail.com"),
            ItemModel(5, "Phạm Văn E", "0369852147", "e@gmail.com"),
            ItemModel(6, "Hoàng Thị F", "0857496321", "f@gmail.com"),
            ItemModel(7, "Vũ Văn G", "0789632145", "g@gmail.com"),
            ItemModel(8, "Trịnh Thị H", "0258964713", "h@gmail.com"),
            ItemModel(9, "Đinh Văn I", "0856932147", "i@gmail.com"),
            ItemModel(10, "Mai Thị K", "0896547123", "k@gmail.com")
        )


        val adapter = ItemAdapter(items)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter

        listView.onItemClickListener  = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("id", items[position].id)
            intent.putExtra("name", items[position].name)
            intent.putExtra("phoneNumber", items[position].phoneNumber)
            intent.putExtra("email", items[position].email)

            startActivity(intent)
        }

        registerForContextMenu(findViewById(R.id.listView))
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.main_menu, menu)
    }
}