import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import extensions.loadImageBitmap

@Composable
@Preview
fun App() {
    val image = "https://br.web.img2.acsta.net/pictures/16/02/03/19/11/303307.jpg"

    MaterialTheme {
        Column {
            Text("Me Before you")
            Image(
                bitmap = image.loadImageBitmap(),
                contentDescription = "Movie",
                modifier = Modifier.fillMaxSize(0.5F)
            )
            Text("Ano: 2016 -  Nota: 7.4")
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Show Time"
    ) {
        App()
    }
}
