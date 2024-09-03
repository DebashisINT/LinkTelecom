package com.breezelinktelecom.features.viewAllOrder.interf

import com.breezelinktelecom.app.domain.NewOrderGenderEntity
import com.breezelinktelecom.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}