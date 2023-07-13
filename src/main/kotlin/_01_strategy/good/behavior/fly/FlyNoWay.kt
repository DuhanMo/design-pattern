package _01_strategy.good.behavior.fly

class FlyNoWay : FlyBehavior {
    override fun perform() {
        println("날지못합니다..")
    }
}
