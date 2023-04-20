package creational.pattern.hero.factory.example

data class Mage(
    override val name: String,
    override val hp: Int,
    override val heroClass: String,
    val mana: Int
): Hero
