package com.breezelinktelecom.features.viewAllOrder.interf

import com.breezelinktelecom.app.domain.NewOrderColorEntity
import com.breezelinktelecom.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}