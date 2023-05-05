package com.example.laboratorio_05.data.model

import android.text.Spannable.Factory
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.laboratorio_05.repositories.MovieRepository

data class MovieModel (
            val name : String,
            val category : String,
            val description : String,
            val qualification : String,
        )


