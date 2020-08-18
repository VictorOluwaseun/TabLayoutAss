//package com.decagon.tablayoutass
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import kotlinx.android.synthetic.main.fragment_viewpager_item.view.*
//
//class ViewPagerAdapter(
//    val fragments: List<Int>
//): RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {
//    inner class ViewPagerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_viewpager_item, parent, false)
//        return ViewPagerViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
//        val curFragment = fragments[position]
//        holder.itemView.frag
//        //supportFragmentManager.beginTransaction().replace(R.id.second_layout, fragment).addToBackStack(null).commit()
//    }
//// simplified coding, coding with flow, coding wih mitch
//    override fun getItemCount(): Int {
//        return fragments.size
//    }
//}