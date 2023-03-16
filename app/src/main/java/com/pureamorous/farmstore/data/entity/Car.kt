package com.pureamorous.farmstore.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Car (
    @PrimaryKey(autoGenerate = true)
    val id:Long,
    val carNumber:Long,
    val carType:Long,
)