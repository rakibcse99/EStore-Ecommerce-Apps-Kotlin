package com.rakibstudio.e_store.repository

import com.rakibstudio.e_store.data.DummyData

class ProductRepository() {

    fun getCategories() = DummyData.getCategoriesData()

    fun getProducts() = DummyData.getProducts()

    fun getBrands() = DummyData.getBrands()

    fun getUser() = DummyData.getUserData()
}