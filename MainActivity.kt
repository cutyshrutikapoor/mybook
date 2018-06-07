@file:Suppress("DEPRECATION")

package com.wordpress.httpssvmdakpathar.vidyamandirapp
import android.app.DownloadManager
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import java.io.File
import android.content.ActivityNotFoundException
import android.util.Log
import android.webkit.MimeTypeMap
import android.webkit.URLUtil
import com.wordpress.httpssvmdakpathar.vidyamandirapp.R.id.btn1
import com.wordpress.httpssvmdakpathar.vidyamandirapp.R.id.message
//import sun.invoke.util.VerifyAccess.getPackageName
class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

      val OpenActivityElib: Button = findViewById(R.id.btn2)
        OpenActivityElib.setOnClickListener {
            val intent = Intent(this, Elibscroll::class.java)
            startActivity(intent)
        }

        val OpenActivityTest: Button = findViewById(R.id.btn5)
        OpenActivityTest.setOnClickListener {
            val intent = Intent(this, test::class.java)
            startActivity(intent)
        }

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

     
    }

        override fun onBackPressed() {
            if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
                drawer_layout.closeDrawer(GravityCompat.START)
            } else {
                super.onBackPressed() }
        }
       
       
            drawer_layout.closeDrawer(GravityCompat.START)
            return true
            
}




   
