import creational.pattern.FactoryExample
import creational.pattern.SingletonExample
import creational.pattern.hero.factory.example.HeroCreation


fun main(args: Array<String>) {

    // Run Singleton Example
    val singletonExample = SingletonExample()
    singletonExample.run()

    // Run Factory Example
    val factoryExample = FactoryExample()
    factoryExample.run()

    // Run Another Factory Example Using Heroes UseCase
    val heroCreation = HeroCreation()
    heroCreation.run()
}

