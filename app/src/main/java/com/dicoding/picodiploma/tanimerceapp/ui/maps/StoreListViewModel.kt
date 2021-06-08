package com.dicoding.picodiploma.tanimerceapp.ui.maps

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.tanimerceapp.data.StoreEntity
import com.dicoding.picodiploma.tanimerceapp.utils.DataDummy

class StoreListViewModel: ViewModel() {
    fun getStoreList(): ArrayList<StoreEntity> = DataDummy.generateStoreList()
}