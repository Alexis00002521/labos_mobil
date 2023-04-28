package com.example.laboratorio_05.ui.movie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.cardview.widget.CardView
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.laboratorio_05.MovieReviewerApplication
import com.example.laboratorio_05.R
import com.example.laboratorio_05.data.description
import com.example.laboratorio_05.data.model.MovieModel
import com.example.laboratorio_05.data.movies
import com.example.laboratorio_05.data.name
import kotlin.math.log

class thirdFragment : Fragment() {
     lateinit var button: Button
    lateinit var name : EditText
     lateinit var category: EditText
     lateinit var Description :EditText
     lateinit var qualification: EditText



    private val movieViewModel: MovieViewModel by activityViewModels{
        MovieViewModel.Factory
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         fun bind()
        {
            name = name.findViewById(R.id.camp_name);
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

}
