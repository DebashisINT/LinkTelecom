package com.breezelinktelecom.features.document.api

import com.breezelinktelecom.features.dymanicSection.api.DynamicApi
import com.breezelinktelecom.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}