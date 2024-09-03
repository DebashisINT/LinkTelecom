package com.breezelinktelecom.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezelinktelecom.app.FileUtils
import com.breezelinktelecom.app.Pref
import com.breezelinktelecom.base.BaseResponse
import com.breezelinktelecom.features.addshop.model.AddLogReqData
import com.breezelinktelecom.features.addshop.model.AddShopRequestData
import com.breezelinktelecom.features.addshop.model.AddShopResponse
import com.breezelinktelecom.features.addshop.model.LogFileResponse
import com.breezelinktelecom.features.addshop.model.UpdateAddrReq
import com.breezelinktelecom.features.contacts.CallHisDtls
import com.breezelinktelecom.features.contacts.CompanyReqData
import com.breezelinktelecom.features.contacts.ContactMasterRes
import com.breezelinktelecom.features.contacts.SourceMasterRes
import com.breezelinktelecom.features.contacts.StageMasterRes
import com.breezelinktelecom.features.contacts.StatusMasterRes
import com.breezelinktelecom.features.contacts.TypeMasterRes
import com.breezelinktelecom.features.dashboard.presentation.DashboardActivity
import com.breezelinktelecom.features.login.model.WhatsappApiData
import com.breezelinktelecom.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}