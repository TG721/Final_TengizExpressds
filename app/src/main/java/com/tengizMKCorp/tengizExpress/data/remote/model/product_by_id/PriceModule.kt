package com.tengizMKCorp.tengizExpress.data.remote.model.product_by_id

data class PriceModule(
    val activity: Boolean,
    val discountPromotion: Boolean,
    val discount: Int,
    val formatedPrice: String,
    val hiddenBigSalePrice: Boolean,
    val id: Int,
    val installment: Boolean,
    val lot: Boolean,
    val maxAmount: MaxAmount,
    val multiUnitName: String,
    val name: String,
    val numberPerLot: Int,
    val oddUnitName: String,
    val preSale: Boolean,

)