package models

data class Top250Data (
    val items: List<Top250DataDetail>,
    val errorMessage: String
)

data class Top250DataDetail(
    val id: String,
    val rank: String,
    val title: String,
    val fullTitleval: String,
    val year: String,
    val image: String,
    val crew: String,
    val imDbRating: String,
    val imDbRatingCount: String
)
fun Top250DataDetail.toMovie(): Movie = Movie(
    this.title,
    this.image,
    this.imDbRating.toDouble(),
    this.year.toInt()
)