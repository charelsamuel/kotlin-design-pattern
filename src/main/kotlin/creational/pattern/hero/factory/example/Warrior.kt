package creational.pattern.hero.factory.example

data class Warrior(
    override val name: String,
    override val hp: Int,
    override val heroClass: String,
    val stamina: Int
): Hero