package com.breezelinktelecom.features.activities.api

import com.breezelinktelecom.features.member.api.TeamApi
import com.breezelinktelecom.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}