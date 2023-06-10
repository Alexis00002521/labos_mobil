package com.example.laboratorio05.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.laboratorio05.data.model.ActorModel
import com.example.laboratorio05.data.model.MovieWithActor

@Dao
interface ActorDao {
    @Query("SELECT * FROM actor_table")
    suspend fun getAllActors()

    @Transaction
    @Insert
    suspend fun insertActor(actor: ActorModel)

    @Query("SELECT * FROM actor_table WHERE actorId = :actorId")
    suspend fun getActorWithActorsById(actorId: Int): MovieWithActor?


}