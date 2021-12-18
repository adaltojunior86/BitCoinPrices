import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitBuilder {
    private val URLBASE: String = "https://api.blockchain.info/"
    fun init(): Retrofit {
        return Retrofit.Builder().baseUrl(URLBASE).addConverterFactory(GsonConverterFactory.create()).build()
    }
}