package com.example.laboratorio_05.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.example.laboratorio_05.R
import com.example.laboratorio_05.databinding.FragmentThirdBinding

class FirstFragment : Fragment() {

    private lateinit var buttonFirstFragment: Button
    private lateinit var cardViewFragment: CardView
    private  lateinit var binding : FirstFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()

        buttonFirstFragment.setOnClickListener{
            it.findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }
        cardViewFragment.setOnClickListener{
            it.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

    }

    private fun bind(){
        buttonFirstFragment = view?.findViewById(R.id.button_first_fragment) as Button
        cardViewFragment = view?.findViewById(R.id.CV_StarWars)as CardView
    }

}