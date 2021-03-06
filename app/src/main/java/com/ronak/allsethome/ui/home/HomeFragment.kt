package com.ronak.allsethome.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ronak.allsethome.R

class HomeFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var recyclerAdapter: ListAdapter

    lateinit var recyclerViewBanner: RecyclerView
    lateinit var recyclerAdapterBanner: ListAdapterBanner

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = root.findViewById(R.id.recyclerView)
        recyclerAdapter = ListAdapter(requireContext())
        recyclerView.layoutManager = GridLayoutManager(context, 3, GridLayoutManager.VERTICAL, false)
        recyclerView.adapter = recyclerAdapter

        recyclerViewBanner = root.findViewById(R.id.id_home_banner)
        recyclerAdapterBanner = ListAdapterBanner(requireContext())
        recyclerViewBanner.layoutManager = LinearLayoutManager(context)
        recyclerViewBanner.adapter = recyclerAdapterBanner

        return root
    }
}