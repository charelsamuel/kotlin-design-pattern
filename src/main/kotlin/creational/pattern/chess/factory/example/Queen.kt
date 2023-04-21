package creational.pattern.chess.factory.example

data class Queen(
    override val pieceType: ChessPieceType,
    override val color: ChessPieceColor,
    override val rank: Char,
    override val file: Char
): ChessPiece
