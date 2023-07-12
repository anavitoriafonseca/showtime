import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import view.App
import webApi.MovieWebClient


fun main() = application {
    MovieWebClient().findTop250Movies()
    Window(
        onCloseRequest = ::exitApplication,
        title = "Show Time"
    ) {
        App()
    }
}
