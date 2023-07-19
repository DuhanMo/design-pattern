package _04_factory.good.factorymethod

import _04_factory.good.factorymethod.car.Car
import _04_factory.good.factorymethod.car.ModelX
import _04_factory.good.factorymethod.car.Roadster


class TeslaCarFactory : CarFactory() {
    override fun createCar(type: String): Car {
        val car = when (type) {
            "SUV" -> ModelX()
            "SPORTS" -> Roadster()
            else -> throw IllegalArgumentException("그런 차는 없어요")
        }
        return car
    }
}