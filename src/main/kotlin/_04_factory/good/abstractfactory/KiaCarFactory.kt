package _04_factory.good.abstractfactory

import _04_factory.good.abstractfactory.car.Car
import _04_factory.good.abstractfactory.car.Carnival
import _04_factory.good.abstractfactory.car.Stinger

class KiaCarFactory : CarFactory() {
    private val ingredientFactory = KiaCarIngredientFactory()

    override fun createCar(type: String): Car {
        val car = when (type) {
            "SUV" -> Carnival(ingredientFactory)
            "SPORTS" -> Stinger(ingredientFactory)
            else -> throw IllegalArgumentException("그런 차는 없어요")
        }
        return car
    }
}