package com.adaltojunior.bitcoinprices.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import com.adaltojunior.bitcoinprices.R


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lastBitCoinPrice: TextView = findViewById(R.id.lastBitCoinPrice)
        LastPriceViewModel().getLastPrice().observe(this, Observer {
                lastPrice -> lastBitCoinPrice.text = lastPrice.market_price_usd.toString()
        })
    }
}
