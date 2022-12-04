package com.example.sem08.viewmodel

import androidx.lifecycle.*
import com.example.sem08.data.LugarDatabase
import com.example.sem08.model.Lugar
import com.example.sem08.repository.LugarRepository
import kotlinx.coroutines.launch

class HomeViewModel(Application) : AndroidViewModel(application) {
    val getLugares: LiveData<List<Lugar>>
    private val repository: LugarRepository

    init {
        val lugarDao = LugarDatabase.getDatabase(application).lugarDao()
        repository = LugarRepository(lugarDao)
        getLugares = repository.getLugares
    }
    fun saveLugar(lugar: Lugar) {
        viewModelScope.launch { repository.deleteLugar(lugar)}
    }
}