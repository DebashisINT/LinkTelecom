package com.breezelinktelecom.features.newcollectionreport

import com.breezelinktelecom.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}