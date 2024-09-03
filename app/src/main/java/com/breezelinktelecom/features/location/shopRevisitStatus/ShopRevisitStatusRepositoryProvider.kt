package com.breezelinktelecom.features.location.shopRevisitStatus

import com.breezelinktelecom.features.location.shopdurationapi.ShopDurationApi
import com.breezelinktelecom.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}