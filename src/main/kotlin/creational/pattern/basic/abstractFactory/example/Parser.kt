package creational.pattern.basic.abstractFactory.example

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.lang.RuntimeException

/*
    This class using Static Factory Method
 */
class Parser private constructor() {

    companion object {
        private val logger: Logger = LoggerFactory.getLogger(Parser::class.java)

        fun property(prop: String): Property {
            val (name, value) = prop.split(":")

            return when(name) {
                "port" -> {
                    // Before
                    //val portProperty = PropertyImpl(name, value.trim().toInt())

                    // After
                    val portProperty = IntProperty(name, value.trim().toInt())
                    showCreationLog(portProperty)

                    return portProperty
                }
                "environment" -> {
                    // Before
                    // val envProperty = PropertyImpl(name, value.trim())

                    // After
                    val envProperty = StringProperty(name, value.trim())
                    showCreationLog(envProperty)

                    return envProperty
                }
                else -> throw RuntimeException("Unknown Property $name")
            }
        }

        fun server(properties: List<String>): ServerConfiguration {
            val parsedProperties = mutableListOf<Property>()
            for (p in properties) {
                parsedProperties += property(p)
            }

            return ServerConfigurationImpl(parsedProperties)

        }

        private fun showCreationLog(property: Property) {
            logger.info("Property created: {}", property.toString())
        }
    }
}