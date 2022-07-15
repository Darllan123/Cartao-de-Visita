package me.dio.businesscard2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.businesscard2.data.BusinessCard
import me.dio.businesscard2.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {
    private  val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListener()
    }
    private fun insertListener(){
        binding.btnClose.setOnClickListener{
            finish()
        }
        binding.btnConfirme.setOnClickListener{


        }
    }
}
