import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import view.App


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Show Time"
    ) {
        App()
    }
}
