package _04_factory.good.abstractfactory

interface IngredientFactory {
    fun createBody(): Body
    fun createWindow(): Window
    fun createTire(): Tire
}