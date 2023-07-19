package _04_factory.good.factorymethod

fun main() {
    val kiaCarFactory = KiaCarFactory()
    val teslaCarFactory = TeslaCarFactory()

    val kiaSuvCar = kiaCarFactory.orderCar("SUV")
    kiaSuvCar.display()
    println()
    val kiaSportsCar = kiaCarFactory.orderCar("SPORTS")
    kiaSportsCar.display()
    println()
    val teslaSportsCar = teslaCarFactory.orderCar("SPORTS")
    teslaSportsCar.display()
    println()
}