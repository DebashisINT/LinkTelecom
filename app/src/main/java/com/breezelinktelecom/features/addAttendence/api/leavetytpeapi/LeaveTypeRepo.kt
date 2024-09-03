package com.breezelinktelecom.features.addAttendence.api.leavetytpeapi

import com.breezelinktelecom.app.Pref
import com.breezelinktelecom.base.BaseResponse
import com.breezelinktelecom.features.addAttendence.model.ApprovalLeaveResponseModel
import com.breezelinktelecom.features.addAttendence.model.LeaveTypeResponseModel
import com.breezelinktelecom.features.leaveapplynew.model.ApprovalRejectReqModel
import com.breezelinktelecom.features.leaveapplynew.model.clearAttendanceonRejectReqModelRejectReqModel
import io.reactivex.Observable

/**
 * Created by Saikat on 22-11-2018.
 */
class LeaveTypeRepo(val apiService: LeaveTypeApi) {
    fun getLeaveTypeList(): Observable<LeaveTypeResponseModel> {
        return apiService.getLeaveTypeList(Pref.session_token!!, Pref.user_id!!)
    }


    fun getApprovalLeaveList(userId:String): Observable<ApprovalLeaveResponseModel> {
        return apiService.getApprovalLeaveList(Pref.session_token!!,userId)
    }

    fun postApprovalRejectclick(ApprovalRejectReqModel: ApprovalRejectReqModel): Observable<BaseResponse> {
        return apiService.postApprovalRejectclick(ApprovalRejectReqModel)
    }

    fun clearAttendanceonRejectclick(clearAttendanceonRejectReModel: clearAttendanceonRejectReqModelRejectReqModel): Observable<BaseResponse> {
        return apiService.clearAttendanceonRejectclick(clearAttendanceonRejectReModel)
    }
}