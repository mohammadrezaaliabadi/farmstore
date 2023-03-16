package com.pureamorous.farmstore.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FarmerBill(
    @PrimaryKey(autoGenerate = true)
    val id:Long,
    val sellerBillId:Long,
    val basketType:Long,
    val basketCount:Long,
    val farmerId:Long,
)