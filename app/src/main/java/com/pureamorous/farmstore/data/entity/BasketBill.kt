package com.pureamorous.farmstore.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
@Entity
data class BasketBill (
    @PrimaryKey(autoGenerate = true)
    val id:Long,
    val companyName:String,
    val billNumber:Long,
    val basketType:Long,
    val price:Long,
    val data: Date,
    val carId:Long,
)