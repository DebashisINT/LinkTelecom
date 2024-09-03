package com.breezelinktelecom.features.dashboard.presentation.api.dayStartEnd

import com.breezelinktelecom.features.stockCompetetorStock.api.AddCompStockApi
import com.breezelinktelecom.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}