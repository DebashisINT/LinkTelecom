package com.breezelinktelecom.features.lead.api

import com.breezelinktelecom.features.NewQuotation.api.GetQuotListRegRepository
import com.breezelinktelecom.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}