package com.breezelinktelecom.features.newcollection.model

import com.breezelinktelecom.app.domain.CollectionDetailsEntity
import com.breezelinktelecom.base.BaseResponse
import com.breezelinktelecom.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}