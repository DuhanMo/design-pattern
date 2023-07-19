package _04_factory.good.factorymethod

import _04_factory.good.factorymethod.car.Car

abstract class CarFactory {
    fun orderCar(type: String): Car {
        val car = createCar(type)
        car.addNumber()
        car.inspect()
        return car
    }

    protected abstract fun createCar(type: String): Car
}