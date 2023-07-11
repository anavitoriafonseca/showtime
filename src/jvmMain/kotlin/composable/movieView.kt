package composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import extensions.loadImageBitmap
import models.Movie
import models.movies

@Composable
fun drawMovieView() {
    LazyColumn(
    ) {
        items(movies){movie ->
            drawMovieItem(movie)
        }
    }
}

@Composable
private fun drawMovieItem(movie: Movie) {
    Column(
        modifier = Modifier
//            .width(200.dp)
            .padding(16.dp)
    ) {
        Image(
            bitmap = movie.image.loadImageBitmap(),
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
                Icon(
                    Icons.Rounded.Star,
                    contentDescription = "movie note",
                    Modifier.height(16.dp),
                    tint = Color.Yellow,

                    )
                Text(
                    "${movie.note}",
                    modifier = Modifier
                        .padding(start = 2.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xffeeeeee)
                )
            }
            Text("${movie.year}", fontSize = 14.sp, color = Color(0xffeeeeee))
        }
        Text(
            movie.title,
            modifier = Modifier.padding(
                start = 16.dp,
                top = 8.dp,
                end = 16.dp
            ),
            fontSize = 12.sp,
            textAlign = TextAlign.Center
        )
        Text("")
    }
}