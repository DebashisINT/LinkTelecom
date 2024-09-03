package com.breezelinktelecom.features.nearbyuserlist.api

import com.breezelinktelecom.app.Pref
import com.breezelinktelecom.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezelinktelecom.features.newcollection.model.NewCollectionListResponseModel
import com.breezelinktelecom.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}