package com.breezelinktelecom.features.location.shopRevisitStatus

import com.breezelinktelecom.base.BaseResponse
import com.breezelinktelecom.features.location.model.ShopDurationRequest
import com.breezelinktelecom.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}