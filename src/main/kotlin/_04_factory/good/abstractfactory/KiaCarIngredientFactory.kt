package _04_factory.good.abstractfactory

class KiaCarIngredientFactory : IngredientFactory {
    override fun createBody(): Body {
        return Body("도봉산 철강")
    }

    override fun createWindow(): Window {
        return Window("3M 산업")
    }

    override fun createTire(): Tire {
        return Tire("넥센 타이어")
    }
}