package com.example.sem08.model

import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import androidx.room.Parcelize
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "lugar")
data class Lugar (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "nombre")
    val nombre = String,
    @ColumnInfo(name = "correo")
    val correo = String,
    @ColumnInfo(name = "telefono")
    val telefono = String,
    @ColumnInfo(name = "web")
    val web = String,
    ): Parcelable

