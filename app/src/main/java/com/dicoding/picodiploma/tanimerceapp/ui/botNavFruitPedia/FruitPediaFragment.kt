package com.dicoding.picodiploma.tanimerceapp.ui.botNavFruitPedia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dicoding.picodiploma.tanimerceapp.R

import kotlinx.android.synthetic.main.fragment_fruit_pedia.*


class FruitPediaFragment : Fragment() {

    companion object {
        private val tabIcon = arrayOf(
            R.drawable.icon_home,
            R.drawable.icon_list,
            R.drawable.icon_scan
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fruit_pedia, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val sectionPagerAdapter = SectionPagerAdapter(this, childFragmentManager)
            view_pager.adapter = sectionPagerAdapter
            tabs.setupWithViewPager(view_pager)
            setupTabIcon()
        }
    }

    private fun setupTabIcon() {
        tabs.getTabAt(0)?.setIcon(tabIcon[0])
        tabs.getTabAt(1)?.setIcon(tabIcon[1])
        tabs.getTabAt(2)?.setIcon(tabIcon[2])
    }
}