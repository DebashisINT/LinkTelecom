package com.breezelinktelecom.features.orderList.model

import com.breezelinktelecom.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}