package creational.pattern.hero.factory.example

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.lang.RuntimeException

/*
    Another Factory Pattern Example Using Heroes Use Case
 */
class HeroCreation {

    fun run() {
        val carlos = mapOf("name" to "Carlos", "hp" to 10, "heroClass" to "Mage", "mana" to 100)
        val jonathan = mapOf("name" to "Jonathan", "hp" to 20, "heroClass" to "Warrior", "stamina" to 100)

        val listOfHero = listOf(carlos, jonathan)
        val heroes = mutableListOf<Hero>()

        for (hero in listOfHero) {
            heroes.add(createHero(hero))
        }

        val logger: Logger = LoggerFactory.getLogger(HeroCreation::class.java)
        logger.info("Our Heroes in Tavern: {}", heroes)
    }

    private fun createHero(hero: Map<String, Any>): Hero {
        val name = hero["name"]!! as String
        val hp = hero["hp"]!! as Int

        return when(val heroClass = hero["heroClass"] as String) {
            "Mage" -> {
                val mana = hero["mana"] as Int
                Mage(name, hp, heroClass, mana)
            }
            "Warrior" -> {
                val stamina = hero["stamina"] as Int
                Warrior(name, hp, heroClass, stamina)
            }
            else -> throw RuntimeException("Unknown Hero Class")
        }
    }
}