package com.breezelinktelecom.features.location.api

import com.breezelinktelecom.features.location.shopdurationapi.ShopDurationApi
import com.breezelinktelecom.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}