package _01_strategy.good

import _01_strategy.good.behavior.fly.FlyBehavior
import _01_strategy.good.behavior.quack.SoundBehavior

class ChinaDuck(
    flyBehavior: FlyBehavior,
    soundBehavior: SoundBehavior
) : Duck(flyBehavior, soundBehavior) {
    override fun display() {
        println("중국 오리의 형상")
    }
}