package com.wordpress.httpssvmdakpathar.vidyamandirapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.net.Uri
import android.view.MenuItem
import android.widget.Button


class Elibscroll : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elibscroll)

        val OpenActivityElib9 : Button = findViewById(R.id.Elib9)
        OpenActivityElib9.setOnClickListener{
            val intent=Intent(this,Ncrt9:: class.java)
            startActivity(intent)}
       

        fun onOptionsItemSelected(item: MenuItem): Boolean {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            when (item.itemId) {
                R.id.action_settings -> return true
                else -> return super.onOptionsItemSelected(item)
            }}
    }

}

