import creational.pattern.SingletonExample
import creational.pattern.chess.factory.example.ChessPieceCreation
import creational.pattern.hero.factory.example.HeroCreation

fun main(args: Array<String>) {

    // Run Singleton Example
    val singletonExample = SingletonExample()
    singletonExample.run()

    // Run Chess Factory Example
    // bpa7 = Black Pawn A7
    // bra8 = Black Rook A8
    // wpa2 = White Pawn A2
    // wra1 = White Rook A1
    val chessPieces = listOf<String>("bpa7", "bra8", "wpa2", "wra1", "wkb1", "wbc1", "wKd1", "wqe1")
    for (chessPiece in chessPieces) {
        val chessPieceCreation = ChessPieceCreation(chessPiece)
        chessPieceCreation.create()
    }

    // Run Another Factory Example Using Heroes UseCase
    val heroCreation = HeroCreation()
    heroCreation.run()
}

