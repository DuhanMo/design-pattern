package _04_factory.bad

fun main() {
    val carFactory = CarFactory()
    val car = carFactory.orderCar("SUV")
    car.display()
}