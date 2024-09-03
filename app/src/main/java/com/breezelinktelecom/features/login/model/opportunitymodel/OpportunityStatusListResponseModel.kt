package com.breezelinktelecom.features.login.model.opportunitymodel

import com.breezelinktelecom.app.domain.OpportunityStatusEntity
import com.breezelinktelecom.app.domain.ProductListEntity
import com.breezelinktelecom.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}