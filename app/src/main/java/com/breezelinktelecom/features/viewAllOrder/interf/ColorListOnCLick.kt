package com.breezelinktelecom.features.viewAllOrder.interf

import com.breezelinktelecom.app.domain.NewOrderGenderEntity
import com.breezelinktelecom.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}