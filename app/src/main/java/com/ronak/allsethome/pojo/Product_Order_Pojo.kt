package com.ronak.allsethome.pojo

data class Product_Order_Pojo(
    val IsSuccess: Boolean,
    val Message: String,
    val ResponseData: List<order_product_list>
)

data class order_product_list(
    val product_id: String,
    val orderId: String,
    val name: String,
    val image: String,
    val HSNCode: String,
    val SKU: String,
    val tax: String,
    val attributeName: String,
    val pack: String,
    val price: String,
    val quantity: String
)