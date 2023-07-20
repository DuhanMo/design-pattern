package _04_factory.good.abstractfactory

import _04_factory.good.abstractfactory.car.Car
import _04_factory.good.abstractfactory.car.ModelX
import _04_factory.good.abstractfactory.car.Roadster


class TeslaCarFactory : CarFactory() {
    private val ingredientFactory = TeslaCarIngredientFactory()

    override fun createCar(type: String): Car {
        val car = when (type) {
            "SUV" -> ModelX(ingredientFactory)
            "SPORTS" -> Roadster(ingredientFactory)
            else -> throw IllegalArgumentException("그런 차는 없어요")
        }
        return car
    }
}