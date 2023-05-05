package com.example.laboratorio_05.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.laboratorio_05.R
import com.example.laboratorio_05.databinding.FragmentThirdBinding

class SecondFragment : Fragment() {
    private  lateinit var binding : SecondFragment
    companion object {
        fun newInstance() = SecondFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SecondFragment().inflate(inflater, container, false)
        return binding.root

    }



}