package com.breezelinktelecom.features.mylearning.apiCall

import com.breezelinktelecom.features.login.api.opportunity.OpportunityListApi
import com.breezelinktelecom.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}