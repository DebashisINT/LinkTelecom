package com.breezelinktelecom.features.mylearning.apiCall

import com.breezelinktelecom.base.BaseResponse
import com.breezelinktelecom.features.leaderboard.api.LeaderboardOverAllData
import com.breezelinktelecom.features.leaderboard.api.LeaderboardOwnData
import com.breezelinktelecom.features.login.api.opportunity.OpportunityListApi
import com.breezelinktelecom.features.login.model.opportunitymodel.OpportunityStatusListResponseModel
import com.breezelinktelecom.features.mylearning.BookmarkFetchResponse
import com.breezelinktelecom.features.mylearning.BookmarkResponse
import com.breezelinktelecom.features.mylearning.CONTENT_WISE_QA_SAVE
import com.breezelinktelecom.features.mylearning.ContentCountSave_Data
import com.breezelinktelecom.features.mylearning.LMSLeaderboardOverAllData
import com.breezelinktelecom.features.mylearning.LMSLeaderboardOwnData
import com.breezelinktelecom.features.mylearning.LMS_CONTENT_INFO
import com.breezelinktelecom.features.mylearning.MyCommentListResponse
import com.breezelinktelecom.features.mylearning.MyLarningListResponse
import com.breezelinktelecom.features.mylearning.SectionsPointsList
import com.breezelinktelecom.features.mylearning.TopicContentWiseAnswerListsFetchResponse
import com.breezelinktelecom.features.mylearning.TopicListResponse
import com.breezelinktelecom.features.mylearning.VideoPlayLMS
import com.breezelinktelecom.features.mylearning.VideoTopicWiseResponse
import io.reactivex.Observable

class LMSRepo(val apiService: LMSApi) {

    fun getTopics(user_id: String): Observable<TopicListResponse> {
        return apiService.getTopics(user_id)
    }

    fun getTopicsWiseVideo(user_id: String ,topic_id: String): Observable<VideoTopicWiseResponse> {
        return apiService.getTopicswiseVideoApi(user_id,topic_id)
    }

    fun saveContentInfoApi(lms_content_info: LMS_CONTENT_INFO): Observable<BaseResponse> {
        return apiService.saveContentInfoApi(lms_content_info)
    }

    fun getMyLraningInfo(user_id: String): Observable<MyLarningListResponse> {
        return apiService.getMyLearningContentList(user_id)
    }

    fun getCommentInfo(topic_id: String ,content_id: String): Observable<MyCommentListResponse> {
        return apiService.getCommentInfo(topic_id , content_id)
    }

    fun saveContentWiseQAApi(mCONTENT_WISE_QA_SAVE: CONTENT_WISE_QA_SAVE): Observable<BaseResponse> {
        return apiService.saveContentWiseQAApi(mCONTENT_WISE_QA_SAVE)
    }

    fun saveContentCount(mContentCountSave_Data: ContentCountSave_Data): Observable<BaseResponse> {
        return apiService.saveContentCount(mContentCountSave_Data)
    }

    fun ownDatalist(user_id: String,branchwise: String,flag: String): Observable<LMSLeaderboardOwnData> {
        return apiService.ownDatalist(user_id,branchwise,flag)
    }

    fun overAllAPI(user_id: String,branchwise: String,flag: String): Observable<LMSLeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,branchwise,flag)
    }

    fun overAllDatalist(session_token: String): Observable<SectionsPointsList> {
        return apiService.overAllDatalist(session_token)
    }

    fun bookmarkApiCall(obj:BookmarkResponse): Observable<BaseResponse> {
        return apiService.bookmarkApiCallApi(obj)
    }

    fun getBookmarkedApiCall(user_id:String): Observable<BookmarkFetchResponse> {
        return apiService.getBookmarkedApiCallApi(user_id)
    }

    fun getTopicContentWiseAnswerLists(user_id: String ,topic_id: String , content_id: String): Observable<TopicContentWiseAnswerListsFetchResponse> {
        return apiService.getTopicContentWiseAnswerLists(user_id,topic_id,content_id)
    }

    fun getTopicContentWiseAnswerUpdate(user_id: String ,session_token: String,topic_id: Int ,topic_name:String, content_id: Int,question_id:Int,question:String,
                                        option_id:Int,option_number:String,option_point:Int,isCorrect:Boolean): Observable<BaseResponse> {
        return apiService.getTopicContentWiseAnswerUpdate(user_id,session_token,topic_id,topic_name,content_id,question_id,question,option_id,option_number,option_point,isCorrect)
    }
}