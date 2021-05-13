package com.ronak.allsethome.ui.booking

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.ronak.allsethome.Map_View
import com.ronak.allsethome.R
import com.ronak.allsethome.ui.home.My_Bookings

class My_Booking : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_booking, container, false)

        val linear = root.findViewById<LinearLayout>(R.id.linear)

        linear!!.setOnClickListener {

            val intent = Intent(context, My_Bookings::class.java)
            startActivity(intent)

        }

        return root
    }
}