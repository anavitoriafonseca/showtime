import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import models.Movie
import view.App
import webApi.MovieWebClient

fun main() = application {
    val client = MovieWebClient()
    var movies: List<Movie> by remember {
        mutableStateOf(emptyList())
    }
    client.findTop250Movies {
        movies = it
    }
    Window(
        onCloseRequest = ::exitApplication,
        title = "Show Time"
    ) {
        App(movies)
    }
}
