package com.example.laboratorio_05.repositories

import com.example.laboratorio_05.data.model.MovieModel
import com.example.laboratorio_05.data.name

class MovieRepository (private  val movies: MutableList<MovieModel>){
    fun getMovies() = movies
    fun addMovies(movie: MovieModel) = movies.add(movie)


}
