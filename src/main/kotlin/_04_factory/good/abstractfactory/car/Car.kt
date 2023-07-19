package _04_factory.good.abstractfactory.car

import _04_factory.good.abstractfactory.Body
import _04_factory.good.abstractfactory.Tire
import _04_factory.good.abstractfactory.Window

abstract class Car(
    val body: Body,
    val window: Window,
    val tire: Tire
) {
    fun addNumber() {
        println("차 넘버달기")
    }

    fun inspect() {
        println("출고전 검수")
    }

    fun explainIngredient() {
        println(
            """
                차체는 ${body.from},
                창문은 ${window.from},
                타이어는 ${tire.from}
                겁니다.
            """.trimIndent()
        )
    }

    abstract fun display()
}
