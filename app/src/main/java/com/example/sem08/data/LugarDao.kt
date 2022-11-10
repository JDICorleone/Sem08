package com.example.sem08.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import com.example.sem08.model.Lugar
import androidx.room.Insert
import androidx.room.Query
import androidx.room.OnConflictStrategy
import androidx.room.Update
import androidx.room.Delete

@Dao
interface LugarDao {
    //Obtener datos
    @Query("SELECT * FROM lugar")
    fun obtenerLugares() : LiveData<List<Lugar>>

    //Insert
    @Insert( onConflict = OnConflictStrategy.IGNORE)
    suspend fun agregarLugar(lugar: Lugar)

    //Update
    @Update( onConflict = OnConflictStrategy.IGNORE)
    suspend fun modificarLugar(lugar: Lugar)

    //Delete
    @Delete
    suspend fun eliminarLugar(lugar: Lugar)

}