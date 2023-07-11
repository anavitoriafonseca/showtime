package models

class Movie(
    val title: String,
    val image: String,
    val note: Double,
    val year: Int
)


val movies = listOf(
    Movie(
        "Me Before you",
        "https://br.web.img2.acsta.net/pictures/16/02/03/19/11/303307.jpg",
        7.4,
        2016
    ),
    Movie(
        "Matilda",
        "https://upload.wikimedia.org/wikipedia/pt/b/b7/Matildaposter.jpg",
        7.0,
        1996
    ),
    Movie(
        "Turning Red",
        "https://t2.tudocdn.net/606424?w=1920",
        7.0,
        2022
    ),
    Movie(
        "Viva - A vida é uma festa",
        "https://play-lh.googleusercontent.com/Y8jmhSXKhy-FeQgfJLAPxNQJAbNxxbxFvq8g0DOz4pCBfPpB2vBiSFFvaFk4dbmDrELk",
        8.4,
        2017
    ),
    Movie(
        "Eternal sunshine of the spotless mind",
        "https://m.media-amazon.com/images/I/71G7AybM3qL._AC_UF894,1000_QL80_.jpg",
        8.3,
        2004
    )

)