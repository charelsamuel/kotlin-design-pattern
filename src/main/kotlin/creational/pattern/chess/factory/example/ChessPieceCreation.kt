package creational.pattern.chess.factory.example

import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ChessPieceCreation(private val notation: String) {

    private val logger: Logger = LoggerFactory.getLogger(ChessPieceCreation::class.java)

    fun create(): ChessPiece {
        val (colorNotation, pieceTypeNotation, file, rank) = notation.toCharArray()

        val color = getPieceColorMap(colorNotation)
        return when (val pieceType = getPieceTypeMap(pieceTypeNotation)) {
            ChessPieceType.PAWN -> {
                val chessPiece = Pawn(pieceType, color, rank, file)
                showCreationLog(chessPiece)

                return chessPiece
            }

            ChessPieceType.ROOK -> {
                val chessPiece = Rook(pieceType, color, rank, file)
                showCreationLog(chessPiece)

                return chessPiece
            }

            ChessPieceType.KNIGHT -> {
                val chessPiece = Knight(pieceType, color, rank, file)
                showCreationLog(chessPiece)

                return chessPiece
            }

            ChessPieceType.BISHOP -> {
                val chessPiece = Bishop(pieceType, color, rank, file)
                showCreationLog(chessPiece)

                return chessPiece
            }

            ChessPieceType.QUEEN -> {
                val chessPiece = Queen(pieceType, color, rank, file)
                showCreationLog(chessPiece)

                return chessPiece
            }

            ChessPieceType.KING -> {
                val chessPiece = King(pieceType, color, rank, file)
                showCreationLog(chessPiece)

                return chessPiece
            }
        }
    }

    private fun showCreationLog(chessPiece: ChessPiece) {
        logger.info("Chess Piece created: {}", chessPiece.toString())
    }

    private fun getPieceTypeMap(typeNotation: Char): ChessPieceType {
        val pieceTypes = mapOf(
            'p' to ChessPieceType.PAWN,
            'r' to ChessPieceType.ROOK,
            'k' to ChessPieceType.KNIGHT,
            'b' to ChessPieceType.BISHOP,
            'q' to ChessPieceType.QUEEN,
            'K' to ChessPieceType.KING
        )

        return pieceTypes[typeNotation]!!
    }

    private fun getPieceColorMap(colorNotation: Char): ChessPieceColor {
        val pieceColors = mapOf('w' to ChessPieceColor.WHITE, 'b' to ChessPieceColor.BLACK)

        return pieceColors[colorNotation]!!
    }
}