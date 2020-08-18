package com.decagon.tablayoutass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val NUM_FRAG = 3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = FragmentAdapter(this)

        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager){t, position ->
        }.attach()

    }

    private inner class FragmentAdapter(f: FragmentActivity): FragmentStateAdapter(f){
        override fun getItemCount(): Int {
            return NUM_FRAG
        }

        override fun createFragment(position: Int): Fragment {
            return  when(position){
                0 -> FragmentOne()
                1->FragmentTwo()
                else -> FragmentThree()
            }
        }
    }
}