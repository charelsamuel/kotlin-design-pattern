package creational.pattern.basic.abstractFactory.example

fun main() {
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