package webApi
import retrofit2.Retrofit

class RetrofitInit {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://raw.githubusercontent.com/alura-cursos/mocks-imdb/main/")
        .build()

    val movieService: MovieService
        get() = retrofit.create(MovieService::class.java)
}
