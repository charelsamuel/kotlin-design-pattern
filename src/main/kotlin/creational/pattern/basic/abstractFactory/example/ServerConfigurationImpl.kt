package creational.pattern.basic.abstractFactory.example

data class ServerConfigurationImpl(
    override val properties: List<Property>
): ServerConfiguration
