package com.danmin.sopkerton

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.danmin.sopkerton.fragment.HeartFragment
import com.danmin.sopkerton.fragment.WriteFragment
import com.danmin.sopkerton.fragment.ZeemFragment

class MypageAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> WriteFragment()
            1 -> HeartFragment()
            else -> ZeemFragment()
        }
    }

    override fun getCount() = 3

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "내가 쓴"
            1 -> "좋아요"
            else -> {
                return "찜"
            }
        }
    }


}