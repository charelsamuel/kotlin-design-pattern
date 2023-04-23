package creational.pattern.chess.factory.example

fun main() {
    // bpa7 = Black Pawn A7
    // bra8 = Black Rook A8
    // wpa2 = White Pawn A2
    // wra1 = White Rook A1
    val chessPieces = listOf<String>("bpa7", "bra8", "wpa2", "wra1", "wkb1", "wbc1", "wKd1", "wqe1")
    for (chessPiece in chessPieces) {
        val chessPieceCreation = ChessPieceCreation(chessPiece)
        chessPieceCreation.create()
    }
}