package _04_factory.good.abstractfactory

class TeslaCarIngredientFactory : IngredientFactory {
    override fun createBody(): Body {
        return Body("티센크루프 철강")
    }

    override fun createWindow(): Window {
        return Window("노드 글라스")
    }

    override fun createTire(): Tire {
        return Tire("미쉐린 타이어")
    }
}