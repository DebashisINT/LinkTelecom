package com.breezelinktelecom.features.stockAddCurrentStock.api

import com.breezelinktelecom.base.BaseResponse
import com.breezelinktelecom.features.location.model.ShopRevisitStatusRequest
import com.breezelinktelecom.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezelinktelecom.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezelinktelecom.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezelinktelecom.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}