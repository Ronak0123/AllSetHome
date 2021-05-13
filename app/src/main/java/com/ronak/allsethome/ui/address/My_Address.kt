package com.ronak.allsethome.ui.address

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.ronak.allsethome.Map_View
import com.ronak.allsethome.R

class My_Address : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_address, container, false)

        val bt_add_address = root.findViewById<Button>(R.id.bt_add_address)

        bt_add_address!!.setOnClickListener {

            val intent = Intent(context, Map_View::class.java)
            startActivity(intent)

        }

        return root
    }
}