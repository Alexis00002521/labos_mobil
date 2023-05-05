package com.example.laboratorio_05.ui.movie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import com.example.laboratorio_05.R
import com.example.laboratorio_05.data.model.MovieModel
import com.example.laboratorio_05.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
     lateinit var button: Button
    lateinit var name : EditText
     lateinit var category: EditText
     lateinit var Description :EditText
     lateinit var qualification: EditText



    private val movieViewModel: MovieViewModel by activityViewModels{
        MovieViewModel.Factory
    }
    private  lateinit var binding : FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         fun bind()
        {
            name = name.findViewById(R.id.name_edit_text);
            category = category.findViewById(R.id.camp_category);
            Description = Description.findViewById(R.id.camp_description);
            qualification = qualification.findViewById(R.id.camp_calificacion);
            button = button.findViewById(R.id.btn_submit);

        }
        button.setOnClickListener{
            val newMovie = MovieModel(
                name.text.toString(),
                category.text.toString(),
                Description.text.toString(),
                qualification.text.toString(),
            )

            movieViewModel.addMovies(newMovie)
            Log.d("movie",movieViewModel.getMovies().toString())
        }
    }

    private fun setViewModel(){
        binding.viewmodel = movieViewModel
    }

}
