package com.breezelinktelecom.features.viewAllOrder.interf

import com.breezelinktelecom.app.domain.NewOrderGenderEntity
import com.breezelinktelecom.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}