package com.breezelinktelecom.features.stockAddCurrentStock.api

import com.breezelinktelecom.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezelinktelecom.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}