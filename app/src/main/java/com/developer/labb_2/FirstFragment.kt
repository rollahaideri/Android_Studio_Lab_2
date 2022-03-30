package com.developer.labb_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val nextBtn : Button = view.findViewById(R.id.next)
        nextBtn.setOnClickListener{
            val fragment = SecondFragment() // Navigate to second Fragment
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView2, fragment)?.commit()

        }
        return view

    }



}