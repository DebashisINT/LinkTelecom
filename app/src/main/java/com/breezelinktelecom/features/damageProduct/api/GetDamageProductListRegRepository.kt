package com.breezelinktelecom.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezelinktelecom.app.FileUtils
import com.breezelinktelecom.base.BaseResponse
import com.breezelinktelecom.features.NewQuotation.model.*
import com.breezelinktelecom.features.addshop.model.AddShopRequestData
import com.breezelinktelecom.features.addshop.model.AddShopResponse
import com.breezelinktelecom.features.damageProduct.model.DamageProductResponseModel
import com.breezelinktelecom.features.damageProduct.model.delBreakageReq
import com.breezelinktelecom.features.damageProduct.model.viewAllBreakageReq
import com.breezelinktelecom.features.login.model.userconfig.UserConfigResponseModel
import com.breezelinktelecom.features.myjobs.model.WIPImageSubmit
import com.breezelinktelecom.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}