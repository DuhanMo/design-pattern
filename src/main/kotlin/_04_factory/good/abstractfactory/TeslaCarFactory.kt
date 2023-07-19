package _04_factory.good.abstractfactory

import _04_factory.good.abstractfactory.car.Car
import _04_factory.good.abstractfactory.car.ModelX
import _04_factory.good.abstractfactory.car.Roadster


class TeslaCarFactory : CarFactory() {
    override fun createCar(type: String): Car {
        val car = when (type) {
            "SUV" -> ModelX(TeslaCarIngredientFactory())
            "SPORTS" -> Roadster(TeslaCarIngredientFactory())
            else -> throw IllegalArgumentException("그런 차는 없어요")
        }
        return car
    }
}