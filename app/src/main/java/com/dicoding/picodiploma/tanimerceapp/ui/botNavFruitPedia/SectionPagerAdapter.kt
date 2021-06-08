package com.dicoding.picodiploma.tanimerceapp.ui.botNavFruitPedia

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.dicoding.picodiploma.tanimerceapp.ui.tabArticle.AritcleFragment
import com.dicoding.picodiploma.tanimerceapp.ui.tabList.ListArticleFragment
import com.dicoding.picodiploma.tanimerceapp.ui.tabScan.ScanFruitFragment

class SectionPagerAdapter(private val mContext: Fragment, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount(): Int = 3

    override fun getItem(position: Int): Fragment =
        when (position) {
            0 -> AritcleFragment()
            1 -> ListArticleFragment()
            2 -> ScanFruitFragment()
            else -> Fragment()
        }

}