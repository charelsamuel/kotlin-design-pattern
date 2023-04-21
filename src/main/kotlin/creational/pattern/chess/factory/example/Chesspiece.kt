package creational.pattern.chess.factory.example

interface ChessPiece {
    val pieceType: ChessPieceType
    val color: ChessPieceColor
    val rank: Char
    val file: Char
}