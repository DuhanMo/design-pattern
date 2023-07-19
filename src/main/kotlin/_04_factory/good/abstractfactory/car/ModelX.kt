package _04_factory.good.abstractfactory.car

import _04_factory.good.abstractfactory.IngredientFactory

class ModelX(
    ingredientFactory: IngredientFactory
) : Car(
    body = ingredientFactory.createBody(),
    window = ingredientFactory.createWindow(),
    tire = ingredientFactory.createTire()
) {

    override fun display() {
        println("테슬라의 SUV ModelX 입니다.")
    }
}