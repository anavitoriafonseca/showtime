package webApi

import com.squareup.moshi.Moshi
import models.Movie
import models.Top250Data
import models.toMovie
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieWebClient {
    private val service = RetrofitInit().movieService

    fun findTop250Movies(onSuccess: (movies: List<Movie>) -> Unit) {
        service.findTop250Movies().enqueue(object : Callback<ResponseBody?> {
            override fun onResponse(
                call: Call<ResponseBody?>,
                response: Response<ResponseBody?>
            ) {
                response.body()?.let { body ->
                    val json = body.string()
                    val top250Data = Moshi.Builder().build()
                        .adapter(Top250Data::class.java)
                        .fromJson(json)
                    val movies = top250Data?.items?.map { it.toMovie() }
                    movies?.let(onSuccess)
                }
            }

            override fun onFailure(
                call: Call<ResponseBody?>,
                t: Throwable
            ) {
            }
        })
    }
}