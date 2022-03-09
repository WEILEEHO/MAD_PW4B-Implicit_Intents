package com.example.implicitintents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.implicitintents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPhone.setOnClickListener { openPhone("tel: +60192185078") }
        binding.btnSms.setOnClickListener   { openSms() }
        binding.btnWeb.setOnClickListener   { openWeb() }
        binding.btnMap.setOnClickListener   { openMap() }
        binding.btnEmail.setOnClickListener { openEmail() }
    }

    private fun openPhone(phone:String) {
        // TODO(1)
        val uri = Uri.parse(phone)
        val intent = Intent(Intent.ACTION_DIAL, uri)

        startActivity(intent)
    }

    private fun openSms() {
        // TODO(2)
        val uri = Uri.parse("sms: +60192185078?body=Hello haiya")
        val intent = Intent(Intent.ACTION_SENDTO, uri)

        startActivity(intent)
    }

    private fun openWeb() {
        // TODO(3)
        val uri = Uri.parse("https://www.tarc.edu.my")
        val intent = Intent(Intent.ACTION_VIEW, uri)

        startActivity(intent)
    }

    private fun openMap() {
        // TODO(4)
        val uri = Uri.parse("geo:0,0?q=3.214946, 101.728447")
        val intent = Intent(Intent.ACTION_VIEW, uri)

        startActivity(intent)
    }

    private fun openEmail() {
        // TODO(5)
        val uri = Uri.parse("mailto:mokch-wm19@student.tarc.edu.my?subject=Demo&body=Hello Haiya")
        val intent = Intent(Intent.ACTION_SENDTO, uri)

        startActivity(intent)
    }
}