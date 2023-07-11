import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import extensions.loadImageBitmap

@Composable
@Preview
fun App() {
    val image = "https://br.web.img2.acsta.net/pictures/16/02/03/19/11/303307.jpg"

    MaterialTheme(
        colors = darkColors()
    ) {
        Surface {
            Box(modifier = Modifier.fillMaxSize()){
                Column(
                    modifier = Modifier
                        .width(200.dp)
                        .padding(16.dp)
                ) {
                    Image(
                        bitmap = image.loadImageBitmap(),
                        contentDescription = "Movie cover",
                        modifier = Modifier
                            .clip(RoundedCornerShape(4.dp)),
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth()
                            .padding(
                                top = 8.dp,
                                start = 8.dp,
                                end = 8.dp
                            ),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Rounded.Star,
                                contentDescription = "movie note",
                                Modifier.height(16.dp),
                                tint = Color.Yellow,

                            )
                            Text("7.4",
                                modifier = Modifier
                                    .padding(start = 2.dp),
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xffeeeeee)
                            )
                        }
                        Text("2016", fontSize = 14.sp, color = Color(0xffeeeeee))
                    }
                    Text("Me Before you",
                        modifier = Modifier.padding(
                            start = 16.dp,
                            top = 8.dp,
                            end = 16.dp
                        ),
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
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
