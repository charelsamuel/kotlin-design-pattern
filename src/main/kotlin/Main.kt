import creational.pattern.FactoryExample
import creational.pattern.SingletonExample


fun main(args: Array<String>) {

    // Run Singleton Example
    val singletonExample = SingletonExample()
    singletonExample.run()

    // Run Factory Example
    val factoryExample = FactoryExample()
    factoryExample.run()
}

