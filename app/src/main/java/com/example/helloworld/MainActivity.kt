package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            test1.setOnClickListener{
                Toast.makeText(this@MainActivity,"Hello" +" "+textname.text,Toast.LENGTH_LONG).show()
            }
            test2.setOnClickListener{
                Toast.makeText(this@MainActivity,"Hallo teman2",Toast.LENGTH_LONG).show()
            }
        }
    }
}