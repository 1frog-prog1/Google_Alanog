package com.example.data.models.lists.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Lists")
class ListDBEntity (
    @PrimaryKey(autoGenerate = true)
    var list_id : Int,

    var name : String
)
