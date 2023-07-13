package _01_strategy.good

import _01_strategy.good.behavior.fly.FlyBehavior
import _01_strategy.good.behavior.quack.SoundBehavior

abstract class Duck(
    private val flyBehavior: FlyBehavior,
    private val soundBehavior: SoundBehavior
) {
    fun swim() {
        println("헤엄헤엄")
    }

    fun fly() {
        flyBehavior.perform()
    }

    fun quack() {
        soundBehavior.perform()
    }

    abstract fun display()
}
