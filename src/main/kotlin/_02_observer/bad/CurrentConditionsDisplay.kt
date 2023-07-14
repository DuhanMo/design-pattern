package _02_observer.bad

class CurrentConditionsDisplay {
    private var temperature = 0f
    private var humidity = 0f

    fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }

    fun display() {
        println(
            "Current conditions: " + temperature
                    + "F degrees and " + humidity + "% humidity"
        )
    }
}