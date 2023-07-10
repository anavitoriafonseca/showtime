import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
//    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        /*Button(onClick = {
            text = "Hello, Desktop!"
        }) {
            Text(text)
        }*/
        Column {
            Text("Me Before you")
            Image(
                painter = painterResource("meBeforeYou.webp"),
                contentDescription = "Movie",
                modifier = Modifier.fillMaxSize(0.5F)
            )
            Text("Ano: 2016 -  Nota: 7.4")
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
