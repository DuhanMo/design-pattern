package _01_strategy.bad

fun main() {
    KoreaDuck().fly()
    ChinaDuck().fly()
    RubberDuck().fly() // 고무오리는 날면안된다. 에러!!
}