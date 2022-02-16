package com.rakibstudio.e_store.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rakibstudio.e_store.repository.ProductRepository

class ViewModelProductProvider(val _productRepository: ProductRepository) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ProductViewModel(_productRepository) as T
    }
}
