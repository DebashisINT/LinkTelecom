package com.breezelinktelecom.features.viewAllOrder.model

import com.breezelinktelecom.app.domain.NewOrderColorEntity
import com.breezelinktelecom.app.domain.NewOrderGenderEntity
import com.breezelinktelecom.app.domain.NewOrderProductEntity
import com.breezelinktelecom.app.domain.NewOrderSizeEntity
import com.breezelinktelecom.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

