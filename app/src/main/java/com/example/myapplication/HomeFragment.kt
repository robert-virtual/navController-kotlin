package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        //view.textView1.setOnClickListener {
        // Navigation.findNavController(view).navigate(R.id.action_homeFragment2_to_bottomSheetFragment2)
        // }
        view.btn_openSheet.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment2_to_bottomSheetFragment2)
        }
        return view
    }


}