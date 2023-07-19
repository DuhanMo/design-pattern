package _04_factory.good.abstractfactory

import _04_factory.good.abstractfactory.car.Car
import _04_factory.good.abstractfactory.car.Carnival
import _04_factory.good.abstractfactory.car.Stinger

class KiaCarFactory : CarFactory() {
    override fun createCar(type: String): Car {
        val car = when (type) {
            "SUV" -> Carnival(KiaCarIngredientFactory())
            "SPORTS" -> Stinger(KiaCarIngredientFactory())
            else -> throw IllegalArgumentException("그런 차는 없어요")
        }
        return car
    }
}