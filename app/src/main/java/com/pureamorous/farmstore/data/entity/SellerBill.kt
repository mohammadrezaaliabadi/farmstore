package com.pureamorous.farmstore.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date
@Entity
data class SellerBill(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val billNumber: Long,
    val data: Date,
    val weight: Long,
    val weightOff: Long,
    val price: Long,
    val totalBasket: Long,
    val buyerId:Long,
    val carId:Long,
)