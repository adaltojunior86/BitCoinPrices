package com.adaltojunior.bitcoinprices

import android.app.Application
import android.content.Context

class BitCoinPricesApplication: Application() {

    init {
        instance = this
    }

    companion object {
        private var instance: BitCoinPricesApplication? = null

        fun applicationContext() : Context {
            return instance!!.applicationContext
        }
    }
}