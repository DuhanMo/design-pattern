package _04_factory.good.factorymethod

import _04_factory.good.factorymethod.car.Car
import _04_factory.good.factorymethod.car.Carnival
import _04_factory.good.factorymethod.car.Stinger

class KiaCarFactory : CarFactory() {
    override fun createCar(type: String): Car {
        val car = when (type) {
            "SUV" -> Carnival()
            "SPORTS" -> Stinger()
            else -> throw IllegalArgumentException("그런 차는 없어요")
        }
        return car
    }
}