package com.example.helloworld

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)



        binding.btn1.setOnClickListener {
            //do wht the button want

            val name = binding.nameText.text.toString()

            if(name== null || name.trim() =="")
                Toast.makeText(this@MainActivity, "Nama tidak boleh kosong", Toast.LENGTH_SHORT) .show()
                else{
            binding.textBase.setText(name)

                //change image
                val imgRes = resources.getIdentifier(name, "drawable", packageName)
                binding.img1.setImageResource(imgRes)

                }
        }
    }
}