package com.breezelinktelecom.features.mylearning.apiCall

import com.breezelinktelecom.app.NetworkConstant
import com.breezelinktelecom.base.BaseResponse
import com.breezelinktelecom.features.addshop.model.AddQuestionSubmitRequestData
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
import com.breezelinktelecom.features.mylearning.VideoTopicWiseResponse
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface LMSApi {

    @FormUrlEncoded
    @POST("LMSInfoDetails/TopicLists")
    fun getTopics(@Field("user_id") user_id: String): Observable<TopicListResponse>

    @FormUrlEncoded
    @POST("LMSInfoDetails/TopicWiseLists")
    fun getTopicswiseVideoApi(@Field("user_id") user_id: String,@Field("topic_id") topic_id: String): Observable<VideoTopicWiseResponse>

    @POST("LMSInfoDetails/TopicContentDetailsSave")
    fun saveContentInfoApi(@Body lms_content_info: LMS_CONTENT_INFO?): Observable<BaseResponse>

    @FormUrlEncoded
    @POST("LMSInfoDetails/LearningContentLists")
    fun getMyLearningContentList(@Field("user_id") user_id: String): Observable<MyLarningListResponse>

    @FormUrlEncoded
    @POST("LMSInfoDetails/CommentLists")
    fun getCommentInfo(@Field("topic_id") topic_id: String , @Field("content_id") content_id: String): Observable<MyCommentListResponse>

    @POST("LMSInfoDetails/TopicContentWiseQASave")
    fun saveContentWiseQAApi(@Body mCONTENT_WISE_QA_SAVE: CONTENT_WISE_QA_SAVE): Observable<BaseResponse>

    @POST("LMSInfoDetails/ContentCountSave")
    fun saveContentCount(@Body mContentCountSave_Data: ContentCountSave_Data): Observable<BaseResponse>

    @FormUrlEncoded
    @POST("LMSInfoDetails/LMSLeaderboardOwnList")
    fun ownDatalist(@Field("user_id") user_id: String,@Field("branchwise") branchwise: String,@Field("flag") flag: String): Observable<LMSLeaderboardOwnData>

    @FormUrlEncoded
    @POST("LMSInfoDetails/LMSLeaderboardOverallList")
    fun overAllDatalist(@Field("user_id") user_id: String,@Field("branchwise") branchwise: String,@Field("flag") flag: String): Observable<LMSLeaderboardOverAllData>

    @FormUrlEncoded
    @POST("LMSInfoDetails/LMSSectionsPointsList")
    fun overAllDatalist(@Field("session_token") session_token: String): Observable<SectionsPointsList>

    @POST("LMSInfoDetails/LMSSaveBookMark")
    fun bookmarkApiCallApi(@Body obj: BookmarkResponse): Observable<BaseResponse>

    @FormUrlEncoded
    @POST("LMSInfoDetails/LMSFetchBookMark")
    fun getBookmarkedApiCallApi(@Field("user_id") user_id: String): Observable<BookmarkFetchResponse>

    @FormUrlEncoded
    @POST("LMSInfoDetails/TopicContentWiseAnswerLists")
    fun getTopicContentWiseAnswerLists(@Field("user_id") user_id: String,@Field("topic_id") topic_id: String,@Field("content_id") content_id: String): Observable<TopicContentWiseAnswerListsFetchResponse>

    @FormUrlEncoded
    @POST("LMSInfoDetails/TopicContentWiseAnswerUpdate")
    fun getTopicContentWiseAnswerUpdate(@Field("user_id") user_id: String,@Field("session_token") session_token: String,@Field("topic_id") topic_id: Int,@Field("topic_name") topic_name: String,@Field("content_id") content_id: Int,@Field("question_id") question_id: Int,@Field("question") question: String,@Field("option_id") option_id: Int,
                                        @Field("option_number") option_number: String ,@Field("option_point") option_point: Int, @Field("isCorrect") isCorrect: Boolean): Observable<BaseResponse>


    companion object Factory {
        fun create(): LMSApi {
            val retrofit = Retrofit.Builder()
                .client(NetworkConstant.setTimeOut())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(NetworkConstant.BASE_URL)
                .build()

            return retrofit.create(LMSApi::class.java)
        }
    }
}