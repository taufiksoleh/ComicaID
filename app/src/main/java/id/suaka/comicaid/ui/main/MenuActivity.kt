package id.suaka.comicaid.ui.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import id.suaka.comicaid.R
import id.suaka.comicaid.ui.main.ui.main.SectionsPagerAdapter


class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_activity)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)?.setIcon(R.drawable.ic_round_home_24)
        tabs.getTabAt(0)?.text = getString(R.string.tab_home)

        tabs.getTabAt(1)?.setIcon(R.drawable.ic_outline_shopping_cart_24)
        tabs.getTabAt(1)?.text = ""

        tabs.getTabAt(2)?.setIcon(R.drawable.ic_outline_person_outline_24)
        tabs.getTabAt(2)?.text = ""

        tabs.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when (tab.position) {
                    0 -> {
                        tab.setIcon(R.drawable.ic_round_home_24)
                        tab.text = getString(R.string.tab_home)

                        tabs.getTabAt(1)?.setIcon(R.drawable.ic_outline_shopping_cart_24)
                        tabs.getTabAt(1)?.text = ""

                        tabs.getTabAt(2)?.setIcon(R.drawable.ic_outline_person_outline_24)
                        tabs.getTabAt(2)?.text = ""
                    }
                    1 -> {
                        tabs.getTabAt(0)?.setIcon(R.drawable.ic_outline_home_24)
                        tabs.getTabAt(0)?.text = ""

                        tab.setIcon(R.drawable.ic_round_shopping_cart_24)
                        tab.text = getString(R.string.tab_cart)

                        tabs.getTabAt(2)?.setIcon(R.drawable.ic_outline_person_outline_24)
                        tabs.getTabAt(2)?.text = ""
                    }
                    2 -> {
                        tabs.getTabAt(0)?.setIcon(R.drawable.ic_outline_home_24)
                        tabs.getTabAt(0)?.text = ""

                        tabs.getTabAt(1)?.setIcon(R.drawable.ic_outline_shopping_cart_24)
                        tabs.getTabAt(1)?.text = ""

                        tab.setIcon(R.drawable.ic_round_person_24)
                        tab.text = getString(R.string.tab_profile)

                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }
}