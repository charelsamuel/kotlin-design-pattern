package creational.pattern

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.lang.RuntimeException

class FactoryExample {

    fun run() {
        val notations = listOf<String>("qa3", "pb2")
        val pieces = mutableListOf<ChessPiece>()
        for (n in notations) {
            pieces.add(createPiece(n))
        }
        val logger: Logger = LoggerFactory.getLogger(FactoryExample::class.java)
        logger.info("Chess-pieces: {}", pieces)
    }

    private fun createPiece(notation: String): ChessPiece {
        val (type, file , rank) = notation.toCharArray()

        return when(type) {
            'q' -> Queen(file, rank)
            'p' -> Pawn(file, rank)
            else -> throw RuntimeException("Unknown Piece: $type")
        }
    }
}
interface ChessPiece {
    val file: Char
    val rank: Char
}

data class Pawn(
    override val file: Char,
    override val rank: Char
): ChessPiece

data class Queen(
    override val file: Char,
    override val rank: Char
): ChessPiece