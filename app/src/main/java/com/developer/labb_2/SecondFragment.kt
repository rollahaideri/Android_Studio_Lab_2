package com.developer.labb_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val prevBtn : Button = view.findViewById(R.id.back)
        prevBtn.setOnClickListener{
            val fragment = FirstFragment() // Navigate to first Fragment
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView2, fragment)?.commit()
        }
        return view
    }


}