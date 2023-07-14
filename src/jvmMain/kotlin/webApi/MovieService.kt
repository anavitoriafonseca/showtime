package webApi

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface MovieService {
    @GET("top250.json")
    fun findTop250Movies(): Call<ResponseBody>
}