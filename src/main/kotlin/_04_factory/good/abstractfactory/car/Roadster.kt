package _04_factory.good.abstractfactory.car

import _04_factory.good.abstractfactory.IngredientFactory

class Roadster(
    ingredientFactory: IngredientFactory
) : Car(
    body = ingredientFactory.createBody(),
    window = ingredientFactory.createWindow(),
    tire = ingredientFactory.createTire()
) {
    override fun display() {
        println("테슬라의 스포츠 모델 로드스터입니다.")
    }
}