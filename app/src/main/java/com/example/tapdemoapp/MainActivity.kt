package com.example.tapdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.tapdemoapp.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var notifications: Notifications
    private lateinit var media: Media
    private lateinit var main: Main
    private lateinit var articles: Articles
    private lateinit var community: Community

    private val TAG = "Navigation"


    private val mOnNavigatonItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item->
        when(item.itemId) {
            R.id.navigation_community -> {
                Log.d(TAG,"Community")
                replaceFragment(community)
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_articles -> {
                Log.d(TAG,"Articles")
                replaceFragment(articles)
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_main -> {
                Log.d(TAG,"Main")
                replaceFragment(main)
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_media -> {
                Log.d(TAG,"Media")
                replaceFragment(media)
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_notif -> {
                Log.d(TAG,"Notification")
                replaceFragment(notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFragments()

        loadFragment(community)

        nav_view.setOnNavigationItemSelectedListener(mOnNavigatonItemSelectedListener)
    }

    private fun initFragments() {
         community = Community()
         articles = Articles()
         main = Main()
         media = Media()
         notifications = Notifications()
    }

    private fun loadFragment(f1: Fragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.add(R.id.root,f1,"community")
        ft.addToBackStack(null)
        ft.commit()
    }

    private fun replaceFragment(f1: Fragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.root,f1)
        ft.commit()
    }
}
