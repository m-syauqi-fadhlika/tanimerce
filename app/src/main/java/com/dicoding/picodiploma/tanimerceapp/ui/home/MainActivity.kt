package com.dicoding.picodiploma.tanimerceapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.dicoding.picodiploma.tanimerceapp.R
import com.dicoding.picodiploma.tanimerceapp.ui.botNavFruitPedia.FruitPediaFragment
import com.dicoding.picodiploma.tanimerceapp.ui.botNavMarket.MarketFragment
import com.dicoding.picodiploma.tanimerceapp.ui.botNavUserProfile.UserProfileFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruitPediaFragment = FruitPediaFragment()
        val marketFragment = MarketFragment()
        val userProfileFragment = UserProfileFragment()

        setCurrentFragment(fruitPediaFragment)

        nav_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.fruitpedia -> setCurrentFragment(fruitPediaFragment)
                R.id.market -> setCurrentFragment(marketFragment)
                R.id.user_profile -> setCurrentFragment(userProfileFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.nav_host_fragment, fragment)
            commit()
        }
}