package creational.pattern

import org.slf4j.Logger
import org.slf4j.LoggerFactory

class SingletonExample() {

    fun run() {
        val myFavouriteMovie = Movie
        Movie.name = "Avengers End Game"
        val yourFavouriteMovie = Movie

        val logger: Logger = LoggerFactory.getLogger(SingletonExample::class.java)
        logger.debug("myFavouriteMovie === yourFavoriteMovie? {}", myFavouriteMovie === yourFavouriteMovie)
        logger.debug("My Favourite Movie is {}, and Your Favourite Movie is {}", Movie.name, Movie.name)
    }

}

object Movie {
    var name: String = ""
}