package com.breezelinktelecom.features.viewAllOrder.orderOptimized

import com.breezelinktelecom.app.domain.ProductOnlineRateTempEntity
import com.breezelinktelecom.base.BaseResponse
import com.breezelinktelecom.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}