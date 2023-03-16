package com.pureamorous.farmstore.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Role(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val Role: String,
)