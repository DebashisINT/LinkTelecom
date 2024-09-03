package com.breezelinktelecom.features.photoReg.present

import com.breezelinktelecom.app.domain.ProspectEntity
import com.breezelinktelecom.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}