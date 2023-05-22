package com.example.laboratorio09

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.corutinesdemo.R
import com.example.corutinesdemo.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var buttonMainThree: Button
    private lateinit var buttonCoroutines: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        buttonCoroutines.setOnClickListener(){
            it.findNavController().navigate(R.id.action_homeFragment_to_coroutinesFragment2)
        }
        buttonMainThree.setOnClickListener(){
            it.findNavController().navigate(R.id.action_homeFragment_to_mainThreadFragment2)
        }
    }
    fun bind(){
        buttonMainThree = view?.findViewById(R.id.main_thread_button)!!
        buttonCoroutines = view?.findViewById(R.id.coroutines_button)!!
    }
}