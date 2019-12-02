package com.adaltojunior.bitcoinprices.service

import RetrofitBuilder
import com.adaltojunior.bitcoinprices.model.BitCoinPrice
import com.adaltojunior.bitcoinprices.network.BitCoinPriceNetwork
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class BitCoinPricesService {
    fun geLastPrice() = RetrofitBuilder().init().create(BitCoinPriceNetwork::class.java).getLastPrice()
}