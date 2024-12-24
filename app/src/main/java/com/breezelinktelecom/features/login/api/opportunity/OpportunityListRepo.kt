package com.breezelinktelecom.features.login.api.opportunity

import com.breezelinktelecom.app.Pref
import com.breezelinktelecom.app.utils.AppUtils
import com.breezelinktelecom.base.BaseResponse
import com.breezelinktelecom.features.addshop.model.AudioFetchDataCLass
import com.breezelinktelecom.features.addshop.model.LoanDetailFetchListsResponse
import com.breezelinktelecom.features.addshop.model.LoanDispositionListsResponse
import com.breezelinktelecom.features.addshop.model.LoanFinalStatusListsResponse
import com.breezelinktelecom.features.addshop.model.LoanRiskTypeListsResponse
import com.breezelinktelecom.features.addshop.model.StockAllResponse
import com.breezelinktelecom.features.contacts.LoanDtlsResponse
import com.breezelinktelecom.features.dashboard.presentation.DashboardActivity
import com.breezelinktelecom.features.login.model.opportunitymodel.OpportunityStatusListResponseModel
import com.breezelinktelecom.features.login.model.productlistmodel.ProductListResponseModel
import com.breezelinktelecom.features.orderITC.SyncDeleteOppt
import com.breezelinktelecom.features.orderITC.SyncEditOppt
import com.breezelinktelecom.features.orderITC.SyncOppt
import com.breezelinktelecom.features.orderList.model.OpportunityListResponseModel
import io.reactivex.Observable
//import timber.log.Timber

/**
 * Created by Saikat on 20-11-2018.
 */
class OpportunityListRepo(val apiService: OpportunityListApi) {
    fun getOpportunityStatus(session_token: String): Observable<OpportunityStatusListResponseModel> {
        return apiService.getOpportunityStatusList(session_token)
    }

    fun saveOpportunity(syncOppt: SyncOppt): Observable<BaseResponse> {
        return apiService.saveOpportunity(syncOppt)
    }

    fun editOpportunity(syncEditOppt: SyncEditOppt): Observable<BaseResponse> {
        return apiService.editOpportunity(syncEditOppt)
    }
    fun deleteOpportunity(syncDeleteOppt: SyncDeleteOppt): Observable<BaseResponse> {
        return apiService.deleteOpportunity(syncDeleteOppt)
    }
    fun getOpportunityL(user_id: String): Observable<OpportunityListResponseModel> {
        return apiService.getOpportunityL(user_id)
    }

    fun getAudioL(user_id: String,data_limit_in_days:String): Observable<AudioFetchDataCLass> {
        return apiService.getAudioLApi(user_id,data_limit_in_days)
    }


    fun getAllStock(user_id: String): Observable<StockAllResponse> {
        return apiService.getAllStockApi(user_id)
    }

    fun getLoanRiskTypeLists(user_id: String): Observable<LoanRiskTypeListsResponse> {
        return apiService.getLoanRiskTypeLists(user_id)
    }

    fun getLoanDispositionLists(user_id: String): Observable<LoanDispositionListsResponse> {
        return apiService.getLoanDispositionLists(user_id)
    }

    fun getLoanFinalStatusLists(user_id: String): Observable<LoanFinalStatusListsResponse> {
        return apiService.getLoanFinalStatusLists(user_id)
    }

    fun getLoanDetailFetch(user_id: String): Observable<LoanDetailFetchListsResponse> {
        return apiService.getLoanDetailFetch(user_id)
    }

    fun syncLoanDtls(obj: LoanDtlsResponse): Observable<BaseResponse> {
        return apiService.syncLoanDtlsApi(obj)
    }
}