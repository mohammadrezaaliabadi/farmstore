package com.pureamorous.farmstore.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BasketType (
    @PrimaryKey(autoGenerate = true)
    val id:Long,
    val name:String
)