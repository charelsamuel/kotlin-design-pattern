import creational.pattern.SingletonExample
import creational.pattern.StaticFactoryExample
import creational.pattern.basic.abstractFactory.example.Parser
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

    // Run Static Factory Example
    StaticFactoryExample(8000)
    StaticFactoryExample.startServerWithPort(8000)

    // Run Abstract Factory Example
    val portProperty = Parser.property("port: 8000")
    // Using PropertyImpl will cause this error. See PropertyCreation.kt
    // val port: Int = portProperty.value
    val port: Int? = portProperty.value as? Int
    if (port != null) {
        // We are seeing that PORT is defined twice
        // This is called VARIABLE SHADOWING
        val port: Int = port
        println("Port $port")
    }

    val properties = listOf("port: 8000", "environment: dev")
    val serverConfiguration = Parser.server(properties)
    println("Server Configuration $serverConfiguration")

}

