package _01_strategy.good

import _01_strategy.good.behavior.fly.FlyNoWay
import _01_strategy.good.behavior.fly.FlyWithWings
import _01_strategy.good.behavior.quack.BbikSounder
import _01_strategy.good.behavior.quack.QuackSounder

fun main() {
    val chinaDuck = ChinaDuck(FlyWithWings(), QuackSounder())
    chinaDuck.display()
    chinaDuck.fly()
    chinaDuck.quack()
    chinaDuck.swim()
    val koreaDuck = KoreaDuck(FlyWithWings(), QuackSounder())
    koreaDuck.display()
    koreaDuck.fly()
    koreaDuck.quack()
    koreaDuck.swim()
    val rubberDuck = RubberDuck(FlyNoWay(), BbikSounder())
    rubberDuck.display()
    rubberDuck.fly()
    rubberDuck.quack()
    rubberDuck.swim()
}
