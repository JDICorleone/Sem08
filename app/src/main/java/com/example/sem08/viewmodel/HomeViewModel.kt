package com.example.sem08.viewmodel

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sem08.data.LugarDatabase
import com.example.sem08.model.Lugar
import com.example.sem08.repository.LugarRepository

class HomeViewModel(Application) : AndroidViewModel(application) {
    val obtenerLugar: LiveData<List<Lugar>>
    private val repository: LugarRepository

    init {
        val lugarDao = LugarDatabase.getDatabase(application).lugarDao()
        repository = LugarRepository(lugarDao)
        obtenerLugares = repository.obtenerLugar
    }
    fun saveLugar(lugar: lugar) {

    }
}