package com.adaltojunior.bitcoinprices.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adaltojunior.bitcoinprices.model.BitCoinPrice
import com.adaltojunior.bitcoinprices.service.BitCoinPricesService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LastPriceViewModel : ViewModel() {
    private val lastPrice: MutableLiveData<BitCoinPrice> by lazy {
        MutableLiveData<BitCoinPrice>().also {
            BitCoinPricesService().geLastPrice().enqueue(object: Callback<BitCoinPrice> {
                override fun onResponse(
                    call: Call<BitCoinPrice>,
                    response: Response<BitCoinPrice>
                ) {
                    lastPrice.value = response.body()
                }

                override fun onFailure(call: Call<BitCoinPrice>, t: Throwable) {
                    lastPrice.value = null
                }
            })
        }
    }

    fun getLastPrice(): LiveData<BitCoinPrice> {
        return lastPrice
    }
}