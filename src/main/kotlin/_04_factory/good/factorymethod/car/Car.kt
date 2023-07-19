package _04_factory.good.factorymethod.car

abstract class Car {
    fun addNumber() {
        println("차 넘버달기")
    }

    fun inspect() {
        println("출고전 검수")
    }

    abstract fun display()
}
