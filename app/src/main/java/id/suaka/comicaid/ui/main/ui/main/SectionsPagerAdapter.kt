package id.suaka.comicaid.ui.main.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import id.suaka.comicaid.R
import id.suaka.comicaid.ui.cart.CartFragment
import id.suaka.comicaid.ui.home.HomeFragment
import id.suaka.comicaid.ui.profile.ProfileFragment

private val TAB_TITLES = arrayOf(
    R.string.tab_home,
    R.string.tab_cart,
    R.string.tab_profile
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position + 1){
            1 -> {
                HomeFragment()
            }
            2 -> {
                CartFragment()
            }
            3 -> {
                ProfileFragment()
            }
            else -> {
                HomeFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 3
    }
}