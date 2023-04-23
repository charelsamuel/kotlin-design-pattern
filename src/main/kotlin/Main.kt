import creational.pattern.SingletonExample
import creational.pattern.StaticFactoryExample

fun main(args: Array<String>) {
    // Run Singleton Example
    val singletonExample = SingletonExample()
    singletonExample.run()

    // Run Static Factory Example
    StaticFactoryExample(8000)
    StaticFactoryExample.startServerWithPort(8000)
}

