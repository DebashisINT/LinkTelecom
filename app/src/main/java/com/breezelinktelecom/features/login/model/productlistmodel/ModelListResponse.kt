package com.breezelinktelecom.features.login.model.productlistmodel

import com.breezelinktelecom.app.domain.ModelEntity
import com.breezelinktelecom.app.domain.ProductListEntity
import com.breezelinktelecom.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}