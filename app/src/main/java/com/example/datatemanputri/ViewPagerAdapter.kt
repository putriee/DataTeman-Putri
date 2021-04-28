package com.example.datatemanputri

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.datateman.GitHubFragment
import com.example.datateman.ProfileFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
        FragmentStateAdapter(fragmentActivity) {
    private val JUMLAH_MENU = 3

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                return MyFriendsFragment()
            }
            1 -> {
                return GitHubFragment()
            }
            2 -> {
                return ProfileFragment()
            }
            else -> {
                return GitHubFragment()
            }
        }
    }

    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}