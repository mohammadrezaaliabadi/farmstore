package com.pureamorous.farmstore.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class User (
    @PrimaryKey(autoGenerate = true)
    val id:Long,
    val firstName:String,
    val lastName:String,
    val nationalNumber:Long,
    val tel:String,
    val address:String
)