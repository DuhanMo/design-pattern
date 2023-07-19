package _04_factory.good.abstractfactory.car

import _04_factory.good.abstractfactory.IngredientFactory

class Carnival(
    ingredientFactory: IngredientFactory
) : Car(
    body = ingredientFactory.createBody(),
    window = ingredientFactory.createWindow(),
    tire = ingredientFactory.createTire()
) {
    override fun display() {
        println("기아의 카니발입니다")
    }
}
