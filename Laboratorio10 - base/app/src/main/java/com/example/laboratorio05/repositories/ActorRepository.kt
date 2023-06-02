package com.example.laboratorio05.repositories

import com.example.laboratorio05.data.dao.ActorDao
import com.example.laboratorio05.data.model.ActorModel
import com.example.laboratorio05.data.model.MovieModel

class ActorRepository(private val actorDao: ActorDao) {
        // TODO: complete Actor ActorRepository
        suspend fun getAllActors() = actorDao.getAllActors()
        // TODO: complete addMovies method
        suspend fun insertActor(actor: ActorModel) = actorDao.insertActor(actor)
}