package _04_factory.good.abstractfactory

import _04_factory.good.abstractfactory.car.Car


abstract class CarFactory {
    fun orderCar(type: String): Car {
        val car = createCar(type)
        car.addNumber()
        car.inspect()
        car.explainIngredient()
        return car
    }

    protected abstract fun createCar(type: String): Car
}