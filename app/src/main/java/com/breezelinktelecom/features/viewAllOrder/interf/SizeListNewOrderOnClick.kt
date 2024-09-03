package com.breezelinktelecom.features.viewAllOrder.interf

import com.breezelinktelecom.app.domain.NewOrderProductEntity
import com.breezelinktelecom.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}