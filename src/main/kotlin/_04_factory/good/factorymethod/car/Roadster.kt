package _04_factory.good.factorymethod.car

class Roadster : Car() {
    override fun display() {
        println("테슬라의 스포츠 모델 로드스터입니다.")
    }
}