package com.example.sem08.data

import androidx.room.Room
import com.example.sem08.model.Lugar
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities =[Lugar::class], version = 1, exportSchema = false)
abstract class LugarDatabase : RoomDatabase(){
    abstract fun lugarDato(): LugarDao

    companion object {
        @Volatile
        private var Instancia: LugarDatabase? = null

        fun getDatabase(context: android.content.Context) : LugarDatabase {
            val bd = Instancia
            if(bd != null){
                return bd
            }
            synchronized(this){
                val instancia = Room.databaseBuilder(
                    context.applicationContext,
                    LugarDatabase::class.java,
                    "lugar_database"
                ).build()
                Instancia = instancia
                return instancia
            }
        }
    }

}
