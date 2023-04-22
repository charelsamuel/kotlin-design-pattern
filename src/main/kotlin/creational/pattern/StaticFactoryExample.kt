package creational.pattern

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/*
    Sometimes, we also want the Static Factory Method to be the only way to
    instantiate our object. In order to do that, we can declare the default constructor
    of our object as private:

    class StaticFactoryExample private constructor(serverPort: Long) {
        ...
    }
 */
class StaticFactoryExample(serverPort: Long) {

    private val logger: Logger = LoggerFactory.getLogger(StaticFactoryExample::class.java)

    init {
        logger.info("Server started on port {}", serverPort)
    }

    companion object {
        fun startServerWithPort(serverPort: Long) = StaticFactoryExample(serverPort)
    }
}