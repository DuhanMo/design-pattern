package _04_factory.bad

import _04_factory.bad.car.Car
import _04_factory.bad.car.Carnival
import _04_factory.bad.car.Stinger

class CarFactory {
    fun orderCar(type: String): Car {
        val car = when (type) {
            "SUV" -> Carnival()
            "SPORTS" -> Stinger()
            else -> throw IllegalArgumentException("그런 차는 없어요")
        }
        car.addNumber()
        car.inspect()
        return car
    }
}