package com.adaltojunior.bitcoinprices.network

import com.adaltojunior.bitcoinprices.model.BitCoinPrice
import retrofit2.Call
import retrofit2.http.GET

interface BitCoinPriceNetwork {
    @GET("stats")
    fun getLastPrice() : Call<BitCoinPrice>
}